from selenium import webdriver
from datetime import date
from webdriver_manager import driver
from webdriver_manager.chrome import ChromeDriverManager
import time
from selenium.webdriver.common.keys import Keys


BaseUrl= 'https://music.youtube.com//'

class TestCase:
    def Explore(self):
        driver = webdriver.Chrome(ChromeDriverManager(version='95.0.4638.54').install())
        ##Membuka Halaman Youtube Music
        driver.get(BaseUrl)
        driver.maximize_window()
        ##Membuka menu Explore
        driver.find_element_by_xpath('//*[@id="layout"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]').click()
        time.sleep(2)
        ##Membuka Menu New release dari halaman explore
        driver.find_element_by_css_selector('#items > ytmusic-navigation-button-renderer:nth-child(1)').click()
        time.sleep(2)
        ##Melihat semua Album dan Singles
        driver.find_element_by_xpath('//*[@id="contents"]/ytmusic-carousel-shelf-renderer[1]/ytmusic-carousel-shelf-basic-header-renderer/h2/div/yt-formatted-string/a').click()
        time.sleep(2)
        ##Membuka kembali menu Explore
        driver.find_element_by_xpath('//*[@id="layout"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]').click()
        time.sleep(2)
        ##Membuka Menu chart
        driver.find_element_by_css_selector('#items > ytmusic-navigation-button-renderer:nth-child(2)').click()
        time.sleep(2)
        ##memilih filter negara
        driver.find_element_by_xpath('//*[@id="button"]/yt-icon').click()
        ##Memilih Global dari filter negara
        driver.find_element_by_xpath('//*[@id="items"]/ytmusic-multi-select-menu-item-renderer[2]/button/yt-formatted-string').click()
        ##Membuka Top 100 Musics Videos
        driver.find_element_by_xpath('//*[@id="contents"]/ytmusic-carousel-shelf-renderer[1]/ytmusic-carousel-shelf-basic-header-renderer/h2/div/yt-formatted-string').click()
        time.sleep(2)
        ##Membuka kembali menu Explore
        driver.find_element_by_xpath('//*[@id="layout"]/ytmusic-nav-bar/div[2]/ytmusic-pivot-bar-renderer/ytmusic-pivot-bar-item-renderer[2]').click()
        time.sleep(2)
        ##Membuka Menu Mood And Genres dari halaman explore
        driver.find_element_by_css_selector('#items > ytmusic-navigation-button-renderer:nth-child(3)').click()
        time.sleep(2)
        #Memilih salah satu dari Mood & Moments
        driver.find_element_by_xpath('//ytmusic-grid-renderer[1]//div[2]//ytmusic-navigation-button-renderer[1]//button[1]').click()
        time.sleep(2)
        driver.back()
        time.sleep(2)
        #Memilih salah satu dari Genres
        driver.find_element_by_xpath('//*[@id="items"]/ytmusic-navigation-button-renderer[9]/button').click()
        time.sleep(10)
        driver.close()
    
obj = TestCase()
obj.Explore()