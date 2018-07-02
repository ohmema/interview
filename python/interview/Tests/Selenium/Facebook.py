import unittest
from selenium import webdriver
from selenium.webdriver.common import keys
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException

class TestSeleniumFacebook(unittest.TestCase):

    def setUp(self):
        self.user = "changpil@gmail.com"
        self.pwd="Lee02800280!"
        self.driver = webdriver.Chrome()
        self.driver.get("http://www.facebook.com")

    def test_login(self):
        try:
            assert "Facebook" in self.driver.title
            user_elem = self.driver.find_element_by_id("email")
            user_elem.send_keys(self.user)
            pwd_elem = self.driver.find_element_by_id("pass")
            pwd_elem = pwd_elem.send_keys(self.pwd)
            login_button_elem = self.driver.find_element_by_id("loginbutton")
            login_button_elem.click()

        except Exception as err:
            self.fail("Unexpected failures {}".format(err))

    def tearDown(self):
        self.driver.close()

if __name__ == "__main__":
    unittest.main()