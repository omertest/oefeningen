package be.vdab.land;

import be.vdab.util.LandException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 *
 * @author omer.aldur
 */
public class Land {

    private  String landCode;
    private  String landNaam;
    private  String hoofdstad;
    private  BigInteger aantInwoners;
    private  BigDecimal oppervlakte;

    public Land(String code, String naam, String stad,
            BigInteger inwoners, BigDecimal opp) {
        try {
            setLandCode(code);
            setLandNaam(naam);
            setHoofdstad(stad);
            setAantalInwoners(inwoners);
            setOppervlakte(opp);
        } catch (LandException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getLandCode() {
        return landCode;
    }

    public final void setLandCode(String landCode) throws LandException {
        if ((landCode == null) || landCode.isEmpty()) {
            throw new LandException("landcode is veplicht in te vullen");
        } else {
            this.landCode = landCode;
        }
    }

    public String getLandNaam() {
        return landNaam;
    }

    public final void setLandNaam(String landNaam) throws LandException {
        if ((landNaam == null) || landNaam.isEmpty()) {
            throw new LandException("landnaam verplicht in te vullen");

        } else {
            this.landNaam = landNaam;
        }

    }

    public String getHoofdstad() {
        return hoofdstad;
    }

    public final void setHoofdstad(String stad) throws LandException {
        if ((hoofdstad == null) || hoofdstad.isEmpty()) {
            throw new LandException("Hoofdstad verplicht in te vullen");
        } else {
            this.hoofdstad = stad;
        }
    }

    public BigInteger getAantInwoners() {
        return aantInwoners;
    }

    public final void setAantalInwoners(BigInteger inwoners) throws LandException {
        if (inwoners.compareTo(BigInteger.ZERO) <= 0) {
            throw new LandException("aantal inwoners moet groter dan 0 zijn");

        } else {
            aantInwoners = inwoners;
        }
    }

    public BigDecimal getOppervlakte() {
        return oppervlakte;
    }

    public final void setOppervlakte(BigDecimal opp) throws LandException {
        if (opp.compareTo(BigDecimal.ZERO) <= 0) {
            throw new LandException("oppervlakte moet groter dan 0 zijn");
        }
        else { oppervlakte =opp;
    }
    }
    
    public BigDecimal bevolkingsDichtHeid () {
        BigDecimal bevolkingsDichtHeid;
        bevolkingsDichtHeid = (new BigDecimal(aantInwoners)).divide(oppervlakte, 2, RoundingMode.HALF_UP);
        return bevolkingsDichtHeid;
        
    }
    
    @Override
    public String toString(){
        return landCode + "; " + landNaam + "; " + hoofdstad + "; "+aantInwoners + ";" + oppervlakte + "; "+ String.format("5.2f",this.bevolkingsDichtHeid()); 
    }
}



