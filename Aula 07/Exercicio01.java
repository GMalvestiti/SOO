import java.util.LinkedList;

public class Exercicio01 {
    private final int DEFAULT_PROTEIN_OFFSET = 3;
    private LinkedList<Sequence> sequences;

    public Exercicio01() {
        this.sequences = new LinkedList<Sequence>();
    }

    public void addSequence(String dna) {
        Sequence sequence = new Sequence(dna);
        this.sequences.add(sequence);
    }

    public void verify() {
        if (this.sequences.size() <= 0) {
            return;
        }

        for (Sequence sequence : this.sequences) {
            int hasATG = sequence.getDna().indexOf("ATG");
            int hasTGA = sequence.getDna().indexOf("TGA");

            if ((hasATG != -1) && (hasTGA != -1) && (hasATG < hasTGA)) {
                String str = sequence.getDna().substring(hasATG + this.DEFAULT_PROTEIN_OFFSET, hasTGA);
                
                if ((str.length() % 3) == 0) {
                    sequence.setProtein(str);
                    sequence.setProtein(true);
                }
            }
        }
    }

    private String listProteins() {
        String result = "";

        for (Sequence sequence: this.sequences) {
            if (sequence.isProtein()) {
                result += sequence.getDna() + " | " + sequence.getProtein() + "\n";
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "\n" + this.listProteins();
    }

    public static void main(String[] args) {
        Exercicio01 ex01 = new Exercicio01();

        ex01.addSequence("ATGCGATACGCTTGA");
        ex01.addSequence("ATGCGATACGTGA");
        ex01.addSequence("ATTAATATGTACTGA");

        ex01.verify();
        System.out.println(ex01.toString());
    }
}