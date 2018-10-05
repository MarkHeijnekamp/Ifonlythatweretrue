

public class index
{

    public static void main(String[] args)
    {

        // MAAK ALLE ONDERDELEN AF OM DE OPDRACHT TE VOLTOOIEN!

        OnderdeelEen();
        OnderdeelTwee();
        OnderdeelDrie();

    }



    public static void OnderdeelEen()
    {

        // ONDERSTAANDE VARIABELE NAMEN EN WAARDEN MAG JE NIET AANPASSEN!
        boolean	waarOfNiet	= false;
        String	stukjeTekst = "TEKST";
        int		getalA		= 3;
        int		getalB		= 5;
        int		getalC		= 7;
        int		getalD		= (int)Math.ceil( Math.random() * 10 ); // Willekeurige waarde van 1 t/m 10.


        /*
         * OPDRACHT OMSCHRIJVING:
         *
         * VERTAAL HET ONDERSTAANDE COMMENTAAR BINNEN DE BLOKHAKEN [] NAAR WERKENDE CODE DOOR if-statements
         * MET DE CORRECTE voorwaarden TOE TE PASSEN.
         *
         */



        // [ALS waarOfNiet NIET GELIJK STAAT AAN true EN getalB GROTER OF GELIJK IS AAN getalA]
            if (waarOfNiet != true && getalB >= getalA){

            }       {

            // [ALS stukjeTekst GELIJK STAAT AAN "TEKST"]
                if (stukjeTekst == "TEKST")           {

                // [ALS getalD KLEINER OF GELIJK STAAT AAN getalA OF ALS getalD GROTER OF GELIJK STAAT AAN getalC]
                if (getalD <= getalA || getalD >= getalC)               {
                    System.out.println("ONDERDEEL EEN: Uitkomst 1 = " + getalD + " ###############");
                }
                // [ZO NIET, ALS getalD NIET GELIJK STAAT AAN getalB]
                else if (getalD != getalB)
                {
                    System.out.println("ONDERDEEL EEN: Uitkomst 2 = " + getalD + " !!!!!!!!!");
                }
                // [ZO NIET, DOE DAN HET VOLGENDE]
                else
                {
                    System.out.println("ONDERDEEL EEN: Uitkomst 3 = " + getalD + " $$$");
                }

            }

        }




    }



    public static void OnderdeelTwee()
    {

        // ONDERSTAANDE VARIABELE NAMEN EN WAARDEN MAG JE NIET AANPASSEN!
        int	testWaardeA	= (int)Math.ceil( Math.random() * 5 ); // Willekeurige waarde van 1 t/m 5.
        String testwaardeString;

        /*
         * OPDRACHT OMSCHRIJVING:
         *
         * MAAK EEN SWITCH-STATEMENT WAARIN JE GEBRUIK MAAKT VAN testWaardeA. DE VARIABELE testWaardeA KAN EEN WAARDE HEBBEN VAN 1 t/m 5.
         * VOOR ELKE UITKOMST VAN testWaardeA MOET JE EEN ANDER RESULTAAT PRINTEN DOOR System.out.println("") TE GEBRUIKEN.
         * (Dus in totaal 5 verschillende uitkomsten!)
         *
         */

        switch(testWaardeA){
            case 1: testwaardeString = "je nummer was 1";
            case 2: testwaardeString = "je nummer was 2";
            case 3: testwaardeString = "je nummer was 3";
            case 4: testwaardeString = "je nummer was 4";
            case 5: testwaardeString = "je nummer was 5";


        }

        System.out.println(testWaardeA);
    }



    public static void OnderdeelDrie()
    {

        // ONDERSTAANDE VARIABELE NAMEN EN WAARDEN MAG JE NIET AANPASSEN!
        int		testWaarde1	= (int)Math.ceil( Math.random() * 5 ); // Willekeurige waarde van 1 t/m 5.
        int		testWaarde2	= testWaarde1;

        boolean	testWaarde3	= true;
        boolean	testWaarde4	= false;



        /*
         * OPDRACHT OMSCHRIJVING:
         *
         * VUL ALLEEN DE CORRECTE OPERATOREN IN OM DE ONDERSTAANDE IF-STATEMENT TE LATEN KLOPPEN.
         * (De uitkomst van de if-statement moet dus JA, GA DOOR zijn.)
         * (Je moet het resultaat "GOED ZO! DE IF-STATEMENT IS GELUKT!" dus te zien krijgen!)
         *
         * HAAL DE COMMENTS VAN DE IF-STATEMENT WEG OM HET TE TESTEN.
         *
         */


        if
        (
        	(testWaarde1 == testWaarde2 || testWaarde2 != 6) == false ||
        	(testWaarde3 != testWaarde4)
        )
        {
            System.out.println("GOED ZO! DE IF-STATEMENT IS GELUKT!");
        }
		else
        {
            System.out.println("JAMMER... DE IF-STATEMENT KLOPT NOG STEEDS NIET.");
        }

    }


}
