package thessarx;

import java.util.*;

    public class Main {

        public static void main(String[] args) { SinglyLinkedList<Pegawai> linkedList = new SinglyLinkedList<>();
            Scanner input = new Scanner(System.in);
            String inputNip, inputNama, inputDivisi, opsi;
            int beranda=0;
            int opsiHapus=0;
            while(beranda!=4){
                System.out.println("Pilih beranda:");
                System.out.println("1. Input data");
                System.out.println("2. Hapus data");
                System.out.println("3. Cek list pegawai");
                System.out.println("4. Keluar");
                beranda=input.nextInt();
                if(beranda==1){
                    System.out.println("Masukkan data");
                    System.out.println("Tuliskan nip, nama dan divisi pegawai");
                    inputNip=input.next();
                    inputNama=input.next();
                    inputDivisi=input.next();

                    System.out.println("Tambahkan data di awal list? (y/n))");
                    opsi=input.next();
                    if(opsi.equals("y")){
                        linkedList.insertAtFront(new Pegawai(inputNip, inputNama, inputDivisi));
                    }
                    if(opsi.equals("n")){
                        linkedList.insertAtBack(new Pegawai(inputNip, inputNama, inputDivisi));
                    }
                }
                else if(beranda==2){
                    System.out.println("Pilih opsi data yang akan dihapus:");
                    System.out.println("1. Data Awal");
                    System.out.println("2. Data Akhir");
                    opsiHapus=input.nextInt();
                    if(opsiHapus==1){
                        linkedList.removeFromFront();
                        linkedList.print();
                    }
                    else if(opsiHapus==2){
                        linkedList.removeFromBack();
                        linkedList.print();
                    }
                }
                else if(beranda==3){
                    linkedList.print();
                }
            }
        }
    }
