from selenium import webdriver
from datetime import date
from webdriver_manager import driver
from webdriver_manager.chrome import ChromeDriverManager
import time
from selenium.webdriver.common.keys import Keys


BaseUrl= 'https://music.youtube.com//'

class TestCase:
    def Home(self):
        driver = webdriver.Chrome(ChromeDriverManager(version='95.0.4638.54').install())
        driver.get(BaseUrl)
        driver.maximize_window()
        #Memutar Lagu
        driver.find_element_by_xpath('//*[@id="play-button"]/div/yt-icon').click()
        time.sleep(5)
        #expand
        driver.find_element_by_xpath('//*[@id="right-controls"]').click()
        time.sleep(20)
        driver.close()
    
obj = TestCase()
obj.Home()