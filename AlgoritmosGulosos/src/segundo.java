import java.util.*;

public class SDMGuloso {
    public static Set<Integer> sdmGuloso(int[] s, int[] f) {
        int n = s.length;
        int f0 = Integer.MIN_VALUE;
        Set<Integer> X = new HashSet<>();
        int i = 0;
        int it = 0; // variável para contabilizar o número de iterações

        for (int k = 0; k < n; k++) {
            it++; // incrementa o contador de iterações
            if (s[k] > f0) {
                X.add(k + 1);
                i = k;
                f0 = f[k];
            }
        }
        
        System.out.println("Número de iterações: " + it);
        return X;
    }

    public static void main(String[] args) {
        int[] s = {4, 6, 13, 4, 2, 6, 7, 9, 1, 3, 9};
        int[] f = {8, 7, 14, 5, 4, 9, 10, 11, 6, 13, 12};

        Set<Integer> sdm = sdmGuloso(s, f);
        System.out.println("Subcoleção disjunta máxima: " + sdm);
        // Errado
    }
}