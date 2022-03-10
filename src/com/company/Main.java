package com.company;

public class Main {
    public static void main(String[] args) {
        String cities[] = {"Londres","Madrid","Nueva York","Buenos Aires", "Asunción", "São Paulo", "Lima",
                "Santiago de Chile", "Lisboa", "Tokio"};
        int temperatures[][] = {
                {-2, 33},
                {-3, 32},
                {-8, 27},
                {4, 37},
                {6, 42},
                {5, 43},
                {0, 39},
                {-7, 27},
                {-1, 31},
                {-10, 35}
        };

        int[] result = get_max_and_min(temperatures);
        System.out.println("Maior temperatura: "+result[0]+"\nDa cidade: "+cities[result[2]]);
        System.out.println("Menor temperatura: "+result[1]+"\nDa cidade: "+cities[result[3]]);
    }

    public static int[] get_max_and_min(int[][] temperatures) {
        int max_temperature = Integer.MIN_VALUE;
        int min_temperature = Integer.MAX_VALUE;
        int city_index_max = 0;
        int city_index_min = 0;

        for (int i = 0; i < temperatures.length; i++){
            if(temperatures[i][1] > max_temperature){
                max_temperature = temperatures[i][1];
                city_index_max = i;
            };
            if(temperatures[i][0] < min_temperature){
                min_temperature = temperatures[i][0];
                city_index_min = i;
            };
        };
        int result[] = {max_temperature, min_temperature, city_index_max, city_index_min};
        return result;
    };
}
