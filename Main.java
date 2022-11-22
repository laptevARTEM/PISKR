public class Main
{
	public static void main(String[] args) {
	    Translator translator = new FreelanceTranslator(new EnglishLanguage());
	    translator.translateTo();
	    translator.translateFrom();
	    translator.giveToRedactor();
	}
}

interface Language {
    void Read();
    void Write();
}

class EnglishLanguage implements Language {
    public void Read() {
        System.out.println("прочитано");
    }
    public void Write() {
        System.out.println("Записано");
    }
}

class SpanishLanguage implements Language {
    public void Read() {
        System.out.println("прочитано");
    }
    public void Write() {
        System.out.println("Записано");
    }
}

class ChineaseLanguage implements Language {
    public void Read() {
        System.out.println("прочитано");
    }
    public void Write() {
        System.out.println("Записано");
    }
}

abstract class Translator {
    protected Language language;
    
    public Translator (Language language) {
        this.language = language;
    }
    
    public void translateTo() {
        language.Write();
    }
    
    public void translateFrom() {
        language.Read();
    }
    
    public abstract void giveToRedactor();
}

class FreelanceTranslator extends Translator {
    public FreelanceTranslator (Language language) {
        super(language);
    }
    
    @Override
    public void giveToRedactor() {
        System.out.println("giveToRedactor 1");
    }
}
class GovTranslator extends Translator {
    public GovTranslator (Language language) {
        super(language);
    }
    
    @Override
    public void giveToRedactor() {
        System.out.println("giveToRedactor 2");
    }
}
