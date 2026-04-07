package Jobsheet4.tugas;

public class Tugas {
    
    static int[] minMax(int[] arr, int awal, int akhir) {
        if (awal == akhir) {
            return new int[] {arr[awal], arr[akhir]};
        } else if (akhir == awal+1) {
            return ((arr[awal] < arr[akhir]) ? (new int[] {arr[awal], arr[akhir]}) : (new int[] {arr[akhir], arr[awal]}));
        } else {
            int mid = (awal + akhir)/2;
            int[] hasil1 = minMax(arr, awal, mid);
            int[] hasil2 = minMax(arr, mid+1, akhir);

            return new int[] {
                ((hasil1[0] < hasil2[0]) ? (hasil1[0]) : (hasil2[0])),
                ((hasil1[1] > hasil2[1]) ? (hasil1[1]) : (hasil2[1])),
            };
        }
    }

    static double rata(int[] arr) {
        double total = 0;
        for (int i : arr) {
            total += i;
        }
        return (total/arr.length);
    }

    public static void main(String[] args) {
        int[] uts = {78, 85, 90, 76, 92, 88, 80, 82};
        int[] uas = {82, 88, 87, 79, 95, 85, 83, 84};

        int[] tinggiRendah = minMax(uts, 0, uts.length-1);

        System.out.println("Nilai UTS");
        System.out.println("Tertinggi :" + tinggiRendah[0]);
        System.out.println("Terendah  :" + tinggiRendah[1]);
        
        System.out.println("\nNilai UAS");
        System.out.println("Rata-rata : " + rata(uas));
    }
}
