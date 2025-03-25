package a3_structuralDesignPattern.AdapterPattern.Examples.Example1;

interface IBankApi {
    boolean ExecuteTransaction(TransferTransaction transaction);
}

class JsonBankApiAdapter implements IBankApi {
    private final JsonBankApi jsonBankApi;

    public JsonBankApiAdapter() {
        this.jsonBankApi = new JsonBankApi();
    }

    @Override
    public boolean ExecuteTransaction(TransferTransaction transaction) {
        return jsonBankApi.ExecuteTransaction(transaction);
    }
}

class XmlBankApiAdapter implements IBankApi {
    private final XmlBankApi xmlBankApi;

    public XmlBankApiAdapter() {
        this.xmlBankApi = new XmlBankApi();
    }

    @Override
    public boolean ExecuteTransaction(TransferTransaction transaction) {
        return xmlBankApi.ExecuteTransaction(transaction);
    }
}


class XmlBankApi implements IBankApi {
    @Override
    public boolean ExecuteTransaction(TransferTransaction transaction) {
        // XML oluşturma
        String xml = String.format(
                "<TransferTransaction>\n" +
                        "    <FromIBAN>%s</FromIBAN>\n" +
                        "    <ToIBAN>%s</ToIBAN>\n" +
                        "    <Amount>%s</Amount>\n" +
                        "</TransferTransaction>",
                transaction.getFromIBAN(),
                transaction.getToIBAN(),
                transaction.getAmount()
        );
        // Call bank api with xml
        System.out.printf("%s\n worked", xml);
        return true;
    }
}

class JsonBankApi implements IBankApi {
    @Override
    public boolean ExecuteTransaction(TransferTransaction transaction) {
        String json = String.format(
                "{\n" +
                        "    \"fromIBAN\": \"%s\",\n" +
                        "    \"toIBAN\": \"%s\",\n" +
                        "    \"amount\": %s\n" +
                        "}",
                transaction.getFromIBAN(),
                transaction.getToIBAN(),
                transaction.getAmount()
        );
        // Call bank api with xml
        System.out.printf("%s\n worked", json);
        return true;
    }
}

// TransferTransaction sınıfı örneği
class TransferTransaction {
    private String fromIBAN;
    private String toIBAN;
    private double amount;

    // Constructor
    public TransferTransaction(String fromIBAN, String toIBAN, double amount) {
        this.fromIBAN = fromIBAN;
        this.toIBAN = toIBAN;
        this.amount = amount;
    }

    // Getter metodları
    public String getFromIBAN() {
        return fromIBAN;
    }

    public String getToIBAN() {
        return toIBAN;
    }

    public double getAmount() {
        return amount;
    }
}


public class Main {
    public static void main(String[] args) {

        TransferTransaction transaction = new TransferTransaction("123456789", "987654321", 100.0);
        var jsonBankApiAdapter = new XmlBankApiAdapter();
        jsonBankApiAdapter.ExecuteTransaction(transaction);
    }
}
