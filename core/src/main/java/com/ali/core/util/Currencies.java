package com.ali.core.util;

import com.google.common.collect.ImmutableMap;

/**
 * @author John L. Jegutanis
 */
public class Currencies {
    public static final ImmutableMap<String, String> CURRENCY_NAMES;

    static {
        ImmutableMap.Builder<String, String> builder = ImmutableMap.builder();
        builder.put("AED", "United Arab Emirates Dirham");
        builder.put("AFN", "Afghan Afghani");
        builder.put("ALL", "Albanian Lek");
        builder.put("AMD", "Armenian Dram");
        builder.put("ANG", "Netherlands Antillean Guilder");
        builder.put("AOA", "Angolan Kwanza");
        builder.put("ARS", "Argentine Peso");
        builder.put("AUD", "Australian Dollar");
        builder.put("AWG", "Aruban Florin");
        builder.put("AZN", "Azerbaijani Manat");
        builder.put("BAM", "Bosnia-Herzegovina Convertible Mark");
        builder.put("BBD", "Barbadian Dollar");
        builder.put("BDT", "Bangladeshi Taka");
        builder.put("BGN", "Bulgarian Lev");
        builder.put("BHD", "Bahraini Dinar");
        builder.put("BIF", "Burundian Franc");
        builder.put("BMD", "Bermudan Dollar");
        builder.put("BND", "Brunei Dollar");
        builder.put("BOB", "Bolivian Boliviano");
        builder.put("BRL", "Brazilian Real");
        builder.put("BSD", "Bahamian Dollar");
        builder.put("BTN", "Bhutanese Ngultrum");
        builder.put("BWP", "Botswanan Pula");
        builder.put("BYR", "Belarusian Ruble");
        builder.put("BZD", "Belize Dollar");
        builder.put("CAD", "Canadian Dollar");
        builder.put("CDF", "Congolese Franc");
        builder.put("CHF", "Swiss Franc");
        builder.put("CLF", "Chilean Unit of Account (UF)");
        builder.put("CLP", "Chilean Peso");
        builder.put("CNY", "Chinese Yuan");
        builder.put("COP", "Colombian Peso");
        builder.put("CRC", "Costa Rican Colón");
        builder.put("CUP", "Cuban Peso");
        builder.put("CVE", "Cape Verdean Escudo");
        builder.put("CZK", "Czech Republic Koruna");
        builder.put("DJF", "Djiboutian Franc");
        builder.put("DKK", "Danish Krone");
        builder.put("DOP", "Dominican Peso");
        builder.put("DZD", "Algerian Dinar");
        builder.put("EEK", "Estonian Kroon");
        builder.put("EGP", "Egyptian Pound");
        builder.put("ERN", "Eritrean Nakfa");
        builder.put("ETB", "Ethiopian Birr");
        builder.put("EUR", "Euro");
        builder.put("FJD", "Fijian Dollar");
        builder.put("FKP", "Falkland Islands Pound");
        builder.put("GBP", "British Pound Sterling");
        builder.put("GEL", "Georgian Lari");
        builder.put("GHS", "Ghanaian Cedi");
        builder.put("GIP", "Gibraltar Pound");
        builder.put("GMD", "Gambian Dalasi");
        builder.put("GNF", "Guinean Franc");
        builder.put("GTQ", "Guatemalan Quetzal");
        builder.put("GYD", "Guyanaese Dollar");
        builder.put("HKD", "Hong Kong Dollar");
        builder.put("HNL", "Honduran Lempira");
        builder.put("HRK", "Croatian Kuna");
        builder.put("HTG", "Haitian Gourde");
        builder.put("HUF", "Hungarian Forint");
        builder.put("IDR", "Indonesian Rupiah");
        builder.put("ILS", "Israeli New Sheqel");
        builder.put("INR", "Indian Rupee");
        builder.put("IQD", "Iraqi Dinar");
        builder.put("IRR", "Iranian Rial");
        builder.put("ISK", "Icelandic Króna");
        builder.put("JMD", "Jamaican Dollar");
        builder.put("JOD", "Jordanian Dinar");
        builder.put("JPY", "Japanese Yen");
        builder.put("KES", "Kenyan Shilling");
        builder.put("KGS", "Kyrgystani Som");
        builder.put("KHR", "Cambodian Riel");
        builder.put("KMF", "Comorian Franc");
        builder.put("KPW", "North Korean Won");
        builder.put("KRW", "South Korean Won");
        builder.put("KWD", "Kuwaiti Dinar");
        builder.put("KYD", "Cayman Islands Dollar");
        builder.put("KZT", "Kazakhstani Tenge");
        builder.put("LAK", "Laotian Kip");
        builder.put("LBP", "Lebanese Pound");
        builder.put("LKR", "Sri Lankan Rupee");
        builder.put("LRD", "Liberian Dollar");
        builder.put("LSL", "Lesotho Loti");
        builder.put("LTL", "Lithuanian Litas");
        builder.put("LVL", "Latvian Lats");
        builder.put("LYD", "Libyan Dinar");
        builder.put("MAD", "Moroccan Dirham");
        builder.put("MDL", "Moldovan Leu");
        builder.put("MGA", "Malagasy Ariary");
        builder.put("MKD", "Macedonian Denar");
        builder.put("MMK", "Myanmar Kyat");
        builder.put("MNT", "Mongolian Tugrik");
        builder.put("MOP", "Macanese Pataca");
        builder.put("MRO", "Mauritanian Ouguiya");
        builder.put("MTL", "Maltese Lira");
        builder.put("MUR", "Mauritian Rupee");
        builder.put("MVR", "Maldivian Rufiyaa");
        builder.put("MWK", "Malawian Kwacha");
        builder.put("MXN", "Mexican Peso");
        builder.put("MYR", "Malaysian Ringgit");
        builder.put("MZN", "Mozambican Metical");
        builder.put("NAD", "Namibian Dollar");
        builder.put("NGN", "Nigerian Naira");
        builder.put("NIO", "Nicaraguan Córdoba");
        builder.put("NOK", "Norwegian Krone");
        builder.put("NPR", "Nepalese Rupee");
        builder.put("NZD", "New Zealand Dollar");
        builder.put("OMR", "Omani Rial");
        builder.put("PAB", "Panamanian Balboa");
        builder.put("PEN", "Peruvian Nuevo Sol");
        builder.put("PGK", "Papua New Guinean Kina");
        builder.put("PHP", "Philippine Peso");
        builder.put("PKR", "Pakistani Rupee");
        builder.put("PLN", "Polish Zloty");
        builder.put("PYG", "Paraguayan Guarani");
        builder.put("QAR", "Qatari Rial");
        builder.put("RON", "Romanian Leu");
        builder.put("RSD", "Serbian Dinar");
        builder.put("RUB", "Russian Ruble");
        builder.put("RWF", "Rwandan Franc");
        builder.put("SAR", "Saudi Riyal");
        builder.put("SBD", "Solomon Islands Dollar");
        builder.put("SCR", "Seychellois Rupee");
        builder.put("SDG", "Sudanese Pound");
        builder.put("SEK", "Swedish Krona");
        builder.put("SGD", "Singapore Dollar");
        builder.put("SHP", "Saint Helena Pound");
        builder.put("SLL", "Sierra Leonean Leone");
        builder.put("SOS", "Somali Shilling");
        builder.put("SRD", "Surinamese Dollar");
        builder.put("STD", "São Tomé and Príncipe Dobra");
        builder.put("SVC", "Salvadoran Colón");
        builder.put("SYP", "Syrian Pound");
        builder.put("SZL", "Swazi Lilangeni");
        builder.put("THB", "Thai Baht");
        builder.put("TJS", "Tajikistani Somoni");
        builder.put("TMT", "Turkmenistani Manat");
        builder.put("TND", "Tunisian Dinar");
        builder.put("TOP", "Tongan Paʻanga");
        builder.put("TRY", "Turkish Lira");
        builder.put("TTD", "Trinidad and Tobago Dollar");
        builder.put("TWD", "New Taiwan Dollar");
        builder.put("TZS", "Tanzanian Shilling");
        builder.put("UAH", "Ukrainian Hryvnia");
        builder.put("UGX", "Ugandan Shilling");
        builder.put("USD", "US Dollar");
        builder.put("UYU", "Uruguayan Peso");
        builder.put("UZS", "Uzbekistan Som");
        builder.put("VEF", "Venezuelan Bolívar");
        builder.put("VND", "Vietnamese Dong");
        builder.put("VUV", "Vanuatu Vatu");
        builder.put("WST", "Samoan Tala");
        builder.put("XAF", "CFA Franc BEAC");
        builder.put("XAG", "Silver");
        builder.put("XAU", "Gold");
        builder.put("XCD", "East Caribbean Dollar");
        builder.put("XDR", "Special Drawing Rights");
        builder.put("XOF", "CFA Franc BCEAO");
        builder.put("XPF", "CFP Franc");
        builder.put("YER", "Yemeni Rial");
        builder.put("ZAR", "South African Rand");
        builder.put("ZMK", "Zambian Kwacha (1968–2012)");
        builder.put("ZMW", "Zambian Kwacha");
        builder.put("ZWL", "Zimbabwean Dollar (2009)");

        CURRENCY_NAMES = builder.build();
    }
}
