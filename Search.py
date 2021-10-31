from selenium import webdriver
from datetime import date
from webdriver_manager import driver
from webdriver_manager.chrome import ChromeDriverManager
import time
from selenium.webdriver.common.keys import Keys

BaseUrl= 'https://music.youtube.com//'

class TestCase:
    def Search(self):
        driver = webdriver.Chrome(ChromeDriverManager(version='95.0.4638.54').install())
        ##Membuka Halaman Youtube Music
        driver.get(BaseUrl)
        driver.maximize_window()
        ##Membuka menu Explore
        driver.find_element_by_css_selector('#placeholder').click()
        time.sleep(2)
        #Search konten
        driver.find_element_by_xpath('/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-search-box/div/div[1]/input').send_keys('Bruno Mars')
        driver.find_element_by_xpath('/html/body/ytmusic-app/ytmusic-app-layout/ytmusic-nav-bar/div[2]/ytmusic-search-box/div/div[1]/input').send_keys(Keys.ENTER)
        time.sleep(2)
        #Memilih artist dari lagu yang akan diputar
        driver.find_element_by_xpath('//*[@id="contents"]/ytmusic-responsive-list-item-renderer/a').click()
        time.sleep(2)
        #memutar lagu secara shuffle
        driver.find_element_by_xpath('//*[@id="header"]/ytmusic-immersive-header-renderer/div/div/div/div[2]/div/div/yt-button-renderer[1]/a').click()
        time.sleep(10)
        #menjeda pada lagu
        driver.find_element_by_xpath('//*[@id="play-pause-button"]').click()
        time.sleep(2)
        #Memutar lagu selanjutnya dari daftar playlist
        driver.find_element_by_xpath('//*[@id="left-controls"]/div/tp-yt-paper-icon-button[3]').click()
        time.sleep(3)
        #Memilih lagu sebelumnya dari daftar playlist
        driver.find_element_by_xpath('//*[@id="left-controls"]/div/tp-yt-paper-icon-button[1]').click()
        driver.find_element_by_xpath('//*[@id="left-controls"]/div/tp-yt-paper-icon-button[1]').click()
        time.sleep(30)
        driver.close()
obj = TestCase()
obj.Search()