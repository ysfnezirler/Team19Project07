@TC01
Feature: vice_dean_teacher_olusturma

  Background: Vice Dean Login Managementon Schools
    Given Kullanici "school_management_url" e gider
    When Kullanici loginAnasayfa butonuna tiklar
    When Kullanici usernamelogin textboxina "vicedeanteam19" girer
    When Kullanici passwordlogin textboxina "vicedeanteam19" girer
    And Kullanici login butonuna tiklar

  Scenario Outline: : TC01 Kullanici Vice Dean Olarak Teacher Olusturur
    When Kullanici Menu butonuna tiklar
    When Kullanici Teacher Management butonuna tiklar
    When Kullanici Choose Lessons dropdownindan bir ders secer
    When Kullanici Name textboxina "<name>" girer
    When Kullanici Surname textboxina "<surname>" girer
    When Kullanici Birth Place textboxina "<birth_place>" girer
    When Kullanici Email textboxina "<email>" girer
    When Kullanici Phone textboxina "<phone>" girer
    When Kullanici gender secer
    When Kullanici Date Of Birth "<date_of_birth>" girer
    When Kullanici Ssn textboxina "<ssn>" girer
    When Kullanici Username textboxina "<username>" girer
    When Kullanici Password textboxina "<password>" girer
    When Kullanici Submit butonuna tiklar
    Then Kullanici Teacher Saved Succsesfully yazisini gorur

    Examples:
      | name   | surname | birth_place | email            | phone        | date_of_birth | ssn         | username   | password |
      | Mizgin | Esen    | Istanbul    | mizgin@gmail.com | 214-545-9564 | 01.02.2000    | 210-58-6541 | mizgin1611 | abcd1254 |