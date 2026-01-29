@AccountListing
Feature: Account Listing

@AccountListingShowHideSaldoTabungan
Scenario: Pengguna menampilkan/menyembunyikan saldo tabungan

Given Pengguna dihalaman Beranda
When Pengguna menekan wording Lihat Semua 
And Pengguna menekan icon hide unhide saldo
Then Sistem menampilkan atau menyembunyikan nominal saldo

@AccountListingShowHideSaldoEwallet
Scenario: Pengguna menampilkan/menyembunyikan saldo e-wallet

Given Pengguna berada di halaman Akun Anda
When Pengguna klik Tab "E-Wallet"
And Pengguna menekan icon hide unhide saldo
Then Sistem menampilkan atau menyembunyikan nominal saldo

@AccountListingShowHideSaldoTabunganRencana
Scenario: Pengguna menampilkan/menyembunyikan saldo tabungan rencana

Given Pengguna berada di halaman Akun Anda
When Pengguna klik Tab "Tabungan Rencana"
And Pengguna menekan icon hide unhide saldo
Then Sistem menampilkan atau menyembunyikan nominal saldo
And Pengguna kembali ke halaman beranda

@AccountListingShowHideSaldoDeposito
Scenario: Pengguna menampilkan/menyembunyikan nominal deposito

Given Pengguna berada di halaman Akun Anda
When Pengguna klik Tab "Deposito"
And Pengguna menekan icon hide unhide nominal deposito
Then Sistem menampilkan atau menyembunyikan nominal deposito
And Pengguna kembali ke halaman beranda

@AccountListingShowHideSaldoDepositoPinjaman
Scenario: Pengguna menampilkan/menyembunyikan nominal Sisa Pembiayaan

Given Pengguna berada di halaman Akun Anda
When Pengguna klik Tab "Pinjaman"
And Pengguna menekan icon hide unhide nominal Sisa Pembiayaan
Then Sistem menampilkan atau menyembunyikan nominal Sisa Pembiayaan
And Pengguna kembali ke halaman beranda