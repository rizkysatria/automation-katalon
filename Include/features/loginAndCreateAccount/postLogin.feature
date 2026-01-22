@PostLogin
Feature: Login ke Aplikasi

Background:
  Given aplikasi dibuka dari awal

  @PostLogin_konvensional
  Scenario: Login akun konvensional berhasil
    Given User berada di splash screen
    When User login dengan password "akun konvensional" yang valid
    Then User berhasil login dan masuk ke Beranda

  @PostLogin_syariah
  Scenario: Login akun syariah berhasil
    Given User berada di splash screen
    When User login dengan password "akun syariah" yang valid
    Then User berhasil login dan masuk ke Beranda
