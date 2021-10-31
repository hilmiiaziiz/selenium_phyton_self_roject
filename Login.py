from selenium import webdriver
from datetime import date
from webdriver_manager import driver
from webdriver_manager.chrome import ChromeDriverManager
import time
from selenium.webdriver.common.keys import Keys


BaseUrl= 'https://music.youtube.com//'

class TestCase:
    def Login(self):
        driver = webdriver.Chrome(ChromeDriverManager(version='95.0.4638.54').install())
        driver.get(BaseUrl)
        driver.maximize_window()
        #Menekan tombol sign-in
        driver.find_element_by_xpath('//*[@id="right-content"]/a').click()
        #Input email
        driver.find_element_by_xpath('//*[@id="identifierId"]').send_keys('hilmi.aziz07@gmail.com')
        #menekan tombol selanjutnya
        driver.find_element_by_xpath('//*[@id="identifierNext"]/div/button/span').click()
        #Input Password
        driver.find_element_by_xpath('//*[@id="password"]/div[1]/div/div[1]/input').send_keys('Password')
        #Menekan tombol login
        driver.find_element_by_xpath('//*[@id="passwordNext"]/div/button').click()
        time.sleep(5)
        driver.close()
    
obj = TestCase()
obj.Login()