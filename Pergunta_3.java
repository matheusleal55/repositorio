import java.util.*;
class Questao_3
{
     
    /**
     * Função para encontrar o número de pares de inteiros
       *  i, j tal que s[i] é um anagrama de s[j].
    */
     
static int anagram_pairs(String []s, int n)
{
    /**
     * Para armazenar contagem de strings
    */
    Map<String, Integer> mp = new HashMap<>();
 
    // Percorra todas as strings e armazene no mapa
    for (int i = 0; i < n; i++)
    {
        // Classifique a sequência
        char []chArr = s[i].toCharArray();
        Arrays.sort(chArr);
        s[i] = new String(chArr);
         
        // Store in the map
        if(mp.containsKey(s[i]))
        {
            mp.put(s[i], mp.get(s[i]) + 1);
        }
        else
        {
            mp.put(s[i], 1);
        }
    }
 
    // Para armazenar o número de pares
    int ans = 0;
 
    // Atravesse o mapa
    for (Map.Entry<String,
                   Integer> i : mp.entrySet())
    {
        int k = i.getValue();
 
        // Conta os pares para cada String
        
        ans += (k * (k - 1)) / 2;
    }
 
    // Retorna a requisicao 
    return ans;
}
 

public static void main(String []args)
{
    String [] s = { "aaab", "aaba", "baaa",
                            "cde", "dec" };
 
    int n = s.length;
 
    // Chamando a funcao
    System.out.println(anagram_pairs(s, n));
    }
}