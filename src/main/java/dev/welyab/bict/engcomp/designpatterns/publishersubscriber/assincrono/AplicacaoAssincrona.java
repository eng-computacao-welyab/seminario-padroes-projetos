package dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono;

import com.amazon.sqs.javamessaging.ProviderConfiguration;
import com.amazon.sqs.javamessaging.SQSConnectionFactory;
import com.amazon.sqs.javamessaging.SQSSession;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sqs.AmazonSQSClientBuilder;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.mensagens.MessageSubscriber;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.vendas.SistemaVendas;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.vendas.modelo.ClienteVendas;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.vendas.modelo.EnderecoVendas;
import dev.welyab.bict.engcomp.designpatterns.publishersubscriber.assincrono.vendas.modelo.ProdutoVendas;

import java.math.BigDecimal;

@SuppressWarnings("all")
public class AplicacaoAssincrona {

    public static void main(String[] args) throws Exception {
        var sqsConnection = new SQSConnectionFactory(
                new ProviderConfiguration(),
                AmazonSQSClientBuilder
                        .standard()
                        .withRegion(Regions.SA_EAST_1).withCredentials(
                                new AWSStaticCredentialsProvider(
                                        new BasicAWSCredentials(
                                                "",
                                                ""
                                        )
                                )
                        )
                        .build()
        ).createConnection();
        var session = sqsConnection.createSession(false, SQSSession.UNORDERED_ACKNOWLEDGE);
        var consumer = session.createConsumer(session.createQueue("teste"));
        consumer.setMessageListener(new MessageSubscriber());
        sqsConnection.start();

        ProdutoVendas produtoVendas = new ProdutoVendas("Televisão", new BigDecimal("1200.99"));
        ClienteVendas clienteVendas = new ClienteVendas("Welyab Paula", "welyab@email");
        EnderecoVendas enderecoVendas = new EnderecoVendas("São Luís", "MA", "65000-000", "2", "Ao lado da padaria");

        var sistemaVendas = new SistemaVendas();
        sistemaVendas.realizarVenda(clienteVendas, enderecoVendas, produtoVendas, new BigDecimal(2));
    }
}
