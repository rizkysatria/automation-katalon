Feature: Detail Tabungan

        Scenario Outline: Menampilkan informasi tabungan berdasarkan jenis kartu "<jenis_kartu>"

            Given Pengguna berada di halaman Akun Anda
             When Pengguna pilih tabungan dengan jenis kartu "<jenis_kartu>" pada listing tabungan
             Then sistem menampilkan informasi tabungan sesuai dengan jenis kartu "<jenis_kartu>"

        @card_details_visa_only
        Examples:
                  | jenis_kartu          |
                  | Visa Konven          |
                  | Visa Konven Platinum |

        @card_details_gpn_only
        Examples:
                  | jenis_kartu  |
                  | GPN          |
                  | GPN Platinum |

        @card_details_kartu_jakarta_only
        Examples:
                  | jenis_kartu   |
                  | Kartu Jakarta |

        @card_details_all_cards
        Examples:
                  | jenis_kartu           |
                  | Visa Syariah          |
                  | Visa Syariah Platinum |
                  | GPN Syariah           |
                  | GPN Syariah Gold      |
                  | GPN Syariah Platinum  |
                  | Kartu Jakarta         |