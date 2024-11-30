package pe.farmaciasperuanas.utils;


import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

public class CryptDecrypt {
    public static final String KEY_SECRET = "LOYALTY-AUTOMATION-QAS";

    public static String encrypt(String cadena)
    {
        if ((cadena != null) && (!cadena.equalsIgnoreCase("")))
        {
            StandardPBEStringEncryptor s = new StandardPBEStringEncryptor();
            s.setPassword(KEY_SECRET);
            return s.encrypt(cadena);
        }
        return null;
    }

    public static String decrypt(String cadena)
    {
        if ((cadena != null) && (!cadena.equalsIgnoreCase("")))
        {
            StandardPBEStringEncryptor s = new StandardPBEStringEncryptor();
            s.setPassword(KEY_SECRET);
            String devuelve = "";
            try
            {
                devuelve = s.decrypt(cadena);
            }
            catch (Exception e)
            {
                System.out.println("Error found in decrypt" + e);
            }
            return devuelve;
        }
        return null;
    }

    public String encode(CharSequence charSequence)
    {
        StandardPBEStringEncryptor s = new StandardPBEStringEncryptor();
        s.setPassword(KEY_SECRET);
        return s.encrypt(charSequence.toString());
    }

    public boolean matches(CharSequence charSequence, String s)
    {
        return charSequence.toString().equals(decrypt(s));
    }
}
