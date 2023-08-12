import java.beans.Encoder;
import java.nio.charset.Charset;
import java.text.*;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        var locaisEscolhidos = new ArrayList<Locale>();

        locaisEscolhidos.add(Locale.CHINESE);
        locaisEscolhidos.add(Locale.FRANCE);
        locaisEscolhidos.add(Locale.JAPAN);
        locaisEscolhidos.add(Locale.CANADA);
        locaisEscolhidos.add(Locale.KOREA);
        locaisEscolhidos.add(Locale.ITALY);
        locaisEscolhidos.add(Locale.TAIWAN);
        locaisEscolhidos.add(Locale.US);
        locaisEscolhidos.add(Locale.UK);
        locaisEscolhidos.add(Locale.GERMANY);
        locaisEscolhidos.add(Locale.FRENCH);
        StringBuilder descricao = new StringBuilder();


        for (Locale locale : locaisEscolhidos) {
            ZonedDateTime zoned = ZonedDateTime.now();
            DateTimeFormatter pattern = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(locale);


            descricao
                    .append("Nome do pais: " + locale.getDisplayCountry() + "\n")
                    .append("Linguagem do país: " + locale.getDisplayLanguage()+ "\n")
                    .append("Data no formato curto: "+ ((SimpleDateFormat)SimpleDateFormat.getDateInstance(DateFormat.SHORT, locale)).toPattern())
                    .append("\nData no formato longo: " + ((SimpleDateFormat)SimpleDateFormat.getDateInstance(DateFormat.LONG, locale)).toPattern())
                    .append("\nFormato de hora: "+ zoned.format(pattern))
                    .append("\nSímbolo da moeda local: "+ NumberFormat.getCurrencyInstance(locale).getCurrency().getSymbol())
                    .append("\nSeparador decimal: "+ (
                            (DecimalFormat)DecimalFormat.getInstance(locale)).
                            getDecimalFormatSymbols().
                            getDecimalSeparator()
                    )
                    .append("\nSeparador de milhar: "+ new DecimalFormatSymbols(locale).getGroupingSeparator())
                    .append("\nCódigo de página Windows: "+ Charset.defaultCharset().displayName(locale) )

                    .append("\n--------\n")

            ;

        }

        System.out.println(descricao.toString());



    }
}