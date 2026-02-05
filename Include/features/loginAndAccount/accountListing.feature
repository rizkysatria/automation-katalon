@AccountListing
Feature: Account Listing

        @AccountListingShowHideSaldo
        Scenario Outline: Pengguna menampilkan/menyembunyikan nominal saldo

            Given Pengguna berada di halaman Akun Anda
             When Pengguna klik Tab "<jenis_saldo>"
              And Pengguna menekan icon hide unhide nominal "<keterangan_text_saldo>"
             Then Sistem menampilkan atau menyembunyikan nominal "<keterangan_text_saldo>"
              And Pengguna kembali ke halaman beranda
        Examples:
                  | jenis_saldo      | keterangan_text_saldo |
                  | Tabungan         | saldo                 |
                  | E-Wallet         | saldo                 |
                  | Tabungan Rencana | saldo                 |
                  | Deposito         | deposito              |
                  | Pinjaman         | sisa pembiayaan       |