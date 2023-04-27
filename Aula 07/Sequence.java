public class Sequence {
    public String dna;
    public String protein;
    public boolean isProtein;

    public Sequence(String dna) {
        this.dna = dna;
        this.protein = null;
        this.isProtein = false;
    }

    public String getDna() {
        return this.dna;
    }

    public void setDna(String dna) {
        this.dna = dna;
    }

    public String getProtein() {
        return this.protein;
    }

    public void setProtein(String protein) {
        this.protein = protein;
    }

    public boolean isProtein() {
        return this.isProtein;
    }

    public void setProtein(boolean isProtein) {
        this.isProtein = isProtein;
    }
}