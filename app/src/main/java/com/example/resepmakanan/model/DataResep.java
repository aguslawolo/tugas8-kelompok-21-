package com.example.resepmakanan.model;

import java.util.ArrayList;

public class DataResep {
    private static String[] namaResep = {
            "Resep Bakso ",
            "Resep Mie Ayam ",
            "Resep Pangsit ",
            "Resep Mie Aceh Goreng ",
            "Resep Mie Aceh Kuah ",
            "Resep Kwetiau",
    };

    private static String[] gambarResep = {
            "https://img-global.cpcdn.com/recipes/62bc0149e02866d8/1200x630cq70/photo.jpg",
            "https://selerasa.com/wp-content/uploads/2015/05/images_mie_Mie_ayam_14-mie-ayam-kampung.jpg",
            "https://www.masakapahariini.com/wp-content/uploads/2018/06/pangsit_tempe_MAHI-780x440.jpg",
            "https://asset.kompas.com/crops/7tBNI9-TCa-oOq8tQTahf0ua1fg=/0x0:968x645/750x500/data/photo/2021/01/27/6010ce2cc1805.jpg",
            "https://cdn-cas.orami.co.id/parenting/original_images/mie_aceh1.jpg",
            "https://piknikdong.com/wp-content/uploads/2020/05/Resep-Kwetiau-Goreng-Enak-Dan-Mudah.jpg",
    };

    private static String[] detailResep = {
            "1. Giling daging menggunakan chopper atau blender sampai setengah halus. Masukkan es batu dan putih telur, proses hingga halus. \n" +
                    "Masukkan sisa bahan, proses lagi sampai tercampur rata dan mulus.\n" +
                    "2. Didihkan air di panci, lalu matikan apinya. Bulatkan bakso dengan tangan, masukkan ke air dengan bantuan sendok yang sudah dicelupkan ke dalam air rebusan.  \n" +
                    "Lakukan sampai adonan bakso habis. Jika sudah, rebus bakso hingga mengapung. Bakso siap digunakan. Bila ingin disimpan, bakso sebaiknya direndam dulu dalam air es.  \n" +
                    "3. Panaskan kaldu tulang sapi, masukkan bumbu-bumbu lainnya.  \n" +
                    "4. Tata bakso, mi kuning, dan bihun dalam mangkuk saji. Beri kuah bakso secukupnya. Tambahkan aneka pelengkap, sajikan. \n" +
                    "\n" +
                    "\n",

            "1. Siapkan wajan bersih, tuang minyak, dan panaskan. Tumis bumbu halus, daun salam, serai, dan daun bawang sampai wangi. \n" +
                    "2. Masukkan ayam dan air. Rebus hingga air mendidih. \n" +
                    "3. Tambahkan kecap, garam, merica, dan kaldu bubuk. Masak sampai bumbu meresap dan kuah mengental. Angkat, siap untuk digunakan.\n",

            "1. Adonan Isi : Campur daging ayam cincang, bawang putih, merica, minyak wijen, daun bawang, tepung terigu, telur dan garam hingga rata.\n" +
                    "2. Ambil selembar kulit pangsit. Taruh 1 sdt adonan isi di bagian tengahnya.\n" +
                    "3. Lipat kulit pangsit ke arah tengah hingga keempat sisi bertemu membentuk tekukan.\n" +
                    "4. Rekatkan dengan air air sisi-sisinys agar tidak terbuka.\n" +
                    "5. Panaskan minyak banyak dengan api sedang.\n" +
                    "6. Goreng pangsit hingga matang dan kering.\n" +
                    "7. Angkat dan tiriskan.\n" +
                    "8. Saus: Masak semua bahan menjadi satu.\n" +
                    "9. Tuangi larutan kanji, didihkan hingga kental.\n",

            "1. Haluskan semua bumbu dengan menggunakan blender atau cobek.\n" +
                    "2. Panaskan minyak di wajan, lalu masukkan bawang merah, bawang putih. Tumis bersama bumbu halus hingga harum, lalu masukkan daging sapi. Aduk rata, masak hingga daging berubah warna, dan tumisan matang.\n" +
                    "3. Tambahkan taoge dan tomat. Masak hingga layu, lalu tambahkan garam, Kecap Manis Bango, Royco Kaldu Sapi, gula pasir, serta cuka.\n" +
                    "4. Masukkan mie, kemudian taburi dengan daun bawang. Aduk hingga tercampur rata lalu angkat dan matikan api.\n" +
                    "5. Sajikan mie goreng Aceh dengan acar dan taburi bawang goreng.",

            "1. Siapkan panci. Tuang 750 ml air, tambahkan daging. Rebus sampai daging empuk. Angkat dan sisihkan. \n" +
                    "2. Tumis bumbu iris dan bumbu halus hingga layu dan harum. Masukkan daging sapi, bumbu lain, dan kaldu dari rebusan daging. Masak sampai dagung lunak dan kuah agak menyusut. \n" +
                    "3. Masukkan kol dan udang. Didihkan kembali. Tambahkan mi, daun bawang, taoge. Masak sampai bumbu meresap dan sayuran layu. Angkat. \n" +
                    "4. Hidangkan mi Aceh kuah selagi panas. Beri irisan daun seledri, emping goreng, dan acar timun.\n",

            "1. Lumuri kwetiau dengan bumbu perendam. Sisihkan. \n" +
                    "2. Panaskan minyak. Tumis bawang putih dan bawang bombai sampai harum. Sisihkan di pinggir wajan. \n" +
                    "3. Tambahkan telur. Aduk sampai berbutir. Masukkan caisim. Aduk sampai setengah layu. Tuang air dan aduk rata. \n" +
                    "4. Tambahkan kwetiau, garam, merica bubuk. Aduk sampai matang. Masukkan daun bawang. Aduk rata.\n",
    };

    public static ArrayList<ModelResep> getListResep() {
        ArrayList<ModelResep> list = new ArrayList<>();
        for (int position = 0; position < namaResep.length; position++) {
            ModelResep modelResep = new ModelResep();
            modelResep.setNamaResep(namaResep[position]);
            modelResep.setDetailResep(detailResep[position]);
            modelResep.setGambarResep(gambarResep[position]);
            list.add(modelResep);
        }
        return list;
    }
}
