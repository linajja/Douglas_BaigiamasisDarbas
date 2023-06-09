package pom.pages;

import org.openqa.selenium.By;

public class Locators {
    public static class Douglas {

        public static class Home {
            public static By buttonAgreeWithAllCookies = By.xpath("//a[@class='btn btn-tiartery btn-lg btn-block btn-comply act-acceptCookies']");
            public static By buttonLoginToAccount = By.xpath("//a[@class='menu_icon need2login']");
            public static By imgLogin = By.xpath("//img[@class='logged_in']");
            public static By buttonChoiceBrand = By.xpath("//a[text()='Prekių ženklai']");
        }

        public static class Login {
            public static By inputEmail = By.xpath("//input[@id='login_email_input']");
            public static By inputPassword = By.xpath("//input[@id='login_password_input']");
            public static By buttonSubmit = By.xpath("//div[@id='popup_login']//button[@type='submit']");
            public static By alertMessage=By.xpath("//div[@class='error_message alert alert-danger']");
        }

        public static class Brand {
            public static By buttonChooseChanelBrand = By.xpath("//img[@alt='CHANEL']");
        }

        public static class Chanel {
            public static By buttonChooseChanelCocoMademoiselleIntense = By.xpath("//img[@alt='COCO MADEMOISELLE INTENSE']");
        }

        public static class ChanelCocoMademoiselleIntense {
            public static By radioInputChoose50mlSize = By.xpath("//div[@class='items ']/div[2]");
            public static By buttonAddToCart = By.xpath("//div[@class='col col-md-12']/button");
            public static By iconOfCart = By.xpath("//a[@class='cart_icon menu_icon']");
        }

        public static class Cart {
            public static By spanProductName = By.xpath("//span[@class='product_name']/a");
            public static By spanProductSize = By.xpath("//div[@class='name']//span[@class='item_name']");
            public static By buttonChooseSample=By.xpath("//a[@class='sample-edit-link link-icon link-primary']");
            public static By spanSampleName=By.xpath("//div[@class='item sample'][2]//span[@class='product_name']");
            public static By buttonAddWrapping=By.xpath("//div[@class='checkbox checkbox-cart-service checkbox-packing-service']");
            public static By spanWrapping=By.xpath("//div[@class='item packing']//span[@class='product_name']");
            public static By buttonAddGiftCard=By.xpath("//div[@class='checkbox checkbox-cart-service checkbox-postcard-service']");
            public static By spanGiftCardAdded=By.xpath("//div[@class='item postcard']//span[@class='product_name']");
            public static By spanGiftCardType=By.xpath("//div[@class='item postcard']//span[@class='product_type']");
            public static By buttonContinue=By.xpath("//a[@id='order_next_step']");
        }
        public static class Samples {
            public static By checkBoxChooseSample (String value) {
                return By.xpath("//div[@class='samples-item']" + value);
            };
            public static By buttonSubmit=By.xpath("//div[@class='gift_samples_wrp active']//button[@type='submit']");
        }
        public static class Wrapping {
            public static By checkboxChooseProductToWrap=By.xpath("//div[@class='checkbox']");
            public static By textareaPackingComment=By.xpath("//div[@class='group gift_pack_text']//textarea[@id='gift_pack_text']");
            public static By buttonSubmit=By.xpath("//div[@class='gift_packing_wrp active']//button[@type='submit']");

        }
        public static class GiftCard {
            public static By buttonChooseCardType=By.xpath("//a[@class='right carousel-control']");
            public static By textareaGiftCardText=By.xpath("//div[@class='gift_postcard_wrp active']//textarea[@id='gift_card_text']");
            public static By buttonSubmit=By.xpath("//div[@class='gift_postcard_wrp active']//button[@type='submit']");
        }

        public static class Checkout {
            public static By radioButtonDPD=By.xpath("//div[@class='radio']//label[@for='to_me2']");
            public static By radioButtonPaymentInAdvance=By.xpath("//div[@class='payment_option']//label[@for='payment_option_prepayment']");
            public static By paragraphPaymentInAdvanceMessage=By.xpath("//div[@id='prepayment_delivery']//p");
            public static By labelAgreeWithRules=By.xpath("//label[@for='rules_agree_checkbox']");
            public static By buttonOrder=By.xpath("//button[@id='cart_confirm_button']");
            public static By messageMissingInfo=By.xpath("//div[@class='error_message alert alert-danger']");
        }
    }
}