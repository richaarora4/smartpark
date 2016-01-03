/*
 * Copyright (c) 2015 AIMIA. All rights reserved.
 */


package citibank.com.smartpark;

/**
 * GMP constants
 */
public final class Constants {
    private Constants() {}

    public static final String APPLICATION_VERSION_NAME = "1.0";

    public static final String XTIFY_APP_KEY                    = "665aacd7-b131-4cf6-a320-c006c641fce4";
    public static final String PROJECT_NUM                      = "683606020484"; // This is the Google Project Number

    //public static final String FLURRY_API_KEY                 = "SZ6PB7QV7YZ2JWZQWYSN";
    public static final String FLURRY_API_KEY                   = "9YQ5HD2VN6SD6TQNJNH9";
    public static final boolean FLURRY_REPORT_EVENTS            = true;
    public static final boolean FLURRY_REPORT_CRASHES           = true;
    public static final boolean FLURRY_REPORT_LOCATION          = true;
    public static final boolean FLURRY_ENABLE_INTERNAL_LOGGING  = true;

    public static final int UNKNOWN = 0;
    public static final int MALE    = 1;
    public static final int FEMALE  = 2;

    public static final int SHOW_BACK_BUTTON_ON_ACTION_BAR          = 0;
    public static final int HIDE_BACK_BUTTON_ON_ACTION_BAR          = 1;
    public static final int SHOW_CROSS_BUTTON_ON_ACTION_BAR         = 2;
    public static final int SHOW_BACK_BUTTON_WHITE_ON_ACTION_BAR    = 3;

    public static final String BARCODE_DATA                         = "barcode_data";
    public static final String BARCODE_DATA_FROM_SCANNER            = "barcode_data_from_scanner";

    public static final String GLOBAL_DATA                          = "global_data";
    public static final String SELECTED_OFFER                       = "selected_offer";
    public static final String REWARD_CATEGORY_FROM_LIST            = "reward_category_from_list";
    public static final String SELECTED_REWARD_CATEGORY_FROM_LIST   = "selected_reward_category_from_list";
    public static final String LOGIN_RESPONSE                       = "login_response";
    public static final String OFFER_LIST                           = "offer_list";
    public static final String BASKET_LIST                          = "basket_list";
    public static final String PROFILE_ABOUT_LIST                   = "profile_about_list";
    public static final String CONTACTS_LIST                        = "contacts_list";
    public static final String FAQS_LIST                            = "faqs_list";
    public static final String PRIVACY_POLICY_LIST                  = "privacy_policy_list";
    public static final String TAC_LIST                             = "tac_list";
    public static final String REWARD_CATEGORY_LIST                 = "reward_category_list";
    public static final String REWARD_ADD_COUNT                     = "1";
    public static final String DELIVERY_ADDRESS_SELECTED            = "deliveryAddress";
    public static final String REWARD_BASKET_SELECTED               = "rewardBasket";
    public static final String HOME_ADDRESS_SELECTED                = "HOMEADDR";
    public static final String WORK_ADDRESS_SELECTED                = "WORKADDR";
    public static final String ORDER_STATUS_PLACED                  = "PLACED";
    public static final String ORDER_STATUS_CANCELED                = "REDEMPTION_CANCELLED";
    public static final String ORDER_STATUS_FAILED                  = "PLACED_FAILED";
    public static final String ORDER_STATUS_PARTIAL_PLACED          = "PARTIAL_PLACED";
    public static final String ORDER_STATUS_CANCELED_TEXT           = "REDEMPTION CANCELLED";
    public static final String ORDER_STATUS                         = "OrderStatus";
    public static final String ORDER_STATUS_VALUE                   = "OrderStatusValue";
    public static final String ADDRESS_SELECTED                     = "selectedAddress";
    public static final String PROFILE_STATEMENT                    = "profileStatement";
    public static final String PROFILE_ABOUT_ME                     = "profileAboutMe";
    public static final String FULL_STATEMENT_WEB_LINK              = "https://memberweb-alpmobilesitv5.endeavourdemo.com/";
    public static final String MEMBER_BALANCES                      = "memberBalance";
    public static final String CURRENT_COUNTRIES                    = "currentCountries";
    public static final String CURRENT_EARNING_CODES                = "currentEarningCodes";
    public static final String PREF_SETTINGS                        = "prefSettings";
    public static final String PREF_EMAIL_SETTING                   = "EmailPreference";
    public static final String PREF_SMS_SETTING                     = "SMS";
    public static final String PREF_COMMUNICATION                   = "communication";
    public static final String PREF_NOTIFICATION                    = "notification";

    public static final String TIER_SILVER                          = "Silver";
    public static final String TIER_GOLD                            = "Gold";
    public static final String TIER_BRONZE                          = "Bronze";

    public static final String TIER_SILVER_CAP                      = "SILVER";
    public static final String TIER_GOLD_CAP                        = "GOLD";
    public static final String TIER_BRONZE_CAP                      = "BRONZE";

    public static final int TIER_SILVER_DEGREE                      = 180;
    public static final int TIER_GOLD_DEGREE                        = 270;
    public static final int TIER_BRONZE_DEGREE                      = 90;

    public static final int TIER_ARC_START_ANGLE                    = 270;

    public static final String USER_TOKEN_TYPE_EMAIL                = "EMAIL";
    public static final String USER_TOKEN_TYPE_CARD                 = "CARD";
    public static final String USER_TOKEN_TYPE_FACEBOOK             = "FB";
    public static final String USER_TOKEN_TYPE                      = "tokenType";

    public static final String TRUE                                 = "true";
    public static final String FALSE                                = "false";
    public static final String SPACE                                = " ";

    public static final String GOOGLE_URL                           = "com.google";
    public static final String SPLASH_VIDEO_RESOURCE                = "android.resource://";
    public static final String SPLASH_MUSIC_RESOURCE                = "com.android.music.musicservicecommand";

    public static final String SEARCH_OFFER_ID                      = "search_offer_id";
    public static final String FROM_SEARCH_OFFER_FRAGMENT           = "from_search_offer_fragment";

    public static final String SEARCH_REWARD_ID                     = "search_reward_id";
    public static final String FROM_SEARCH_REWARD_FRAGMENT          = "from_reward_offer_fragment";
    public static final String SEARCH_REWARD_CATEGORY_ITEM_ID       = "search_reward_category_item_id";

    public static final String SELECTED_REWARD_FROM_REWARD_CATEGORY_FROM_LIST = "selected_reward_from_reward_category_from_list";
    /**
     * PARAMS for Fonts Used
     */
    public static final String ROBOTO_BOLD_FONT                     = "fonts/Roboto-Bold.ttf";
    public static final String ROBOTO_LIGHT_FONT                    = "fonts/Roboto-Light.ttf";
    public static final String ROBOTO_REGULAR_FONT                  = "fonts/Roboto-Regular.ttf";

    public static class NavigationDrawerItems {
        public static final String HOME            = "Home";
        public static final String OFFER           = "My Offers";
        public static final String REWARDS         = "Rewards";
        //      public static final int WISHLIST           = 3;
        public static final String EARNING_CODES   = "Earning Codes";
        public static final String BASKET          = "Basket";
        public static final String PROFILE         = "Profile";
        public static final String SEARCH          = "Search";
        public static final String GAMES           = "Games";
        public static final String MESSAGES        = "Messages";
        public static final String STATEMENT       = "Statements";
        public static final String SETTINGS        = "Settings";
        public static final String ABOUT           = "About";
        public static final String LOGOUT          = "Logout";
    }

    public static class SharedPref{
        public static final String PREF_BASKET_COUNT    = "pref_basket_count";
        public static final String PREF_WELCOME_MESSAGE = "pref_welcome_message";
        public static final String PREF_EMAIL_COUNTDOWN = "pref_email_counter";
        public static final String PREF_CARD_COUNTDOWN  = "pref_card_counter";
        public static final String PREF_FB_ACCESS_TOKEN = "pref_fb_token";
        public static final String PREF_FB_UNIQUE_USER  = "pref_fb_unique_user";
    }

    public static final int SPLASH_CONTENT_COUNT                    = 5;
    public static final int PROFILE_STATEMENTS_TO_BE_SHOWN_COUNT    = 8;
    public static final int EMAIL_LOCK_TRIES                        = 3;
    public static final int EMAIL_LOCK_DURATION_IN_SECONDS          = 30;
    public static final int CARD_LOCK_TRIES                         = 3;
    public static final int CARD_LOCK_DURATION_IN_SECONDS           = 30;
    public static final int BASKET_COUNT_ZERO                       = 0;
    public static final int PROFILE_PICTURE_NORMAL                  = -3;
    public static final int PROFILE_PICTURE_LARGE                   = -4;
    public static final String BASKET_COUNT                         = "basket_count";
    public static final String USER_WELCOME_MESSAGE_SHOW            = "USER_WELCOME_MESSAGE_SHOW";
    public static final String FB_USER_EMAIL                        = "fb_user_email";

    /**
     * Category IDs for Dev & SIT
     */
    public static class RewardCategoryIDs {
        public static final String EVENT_ID    = "5";
        public static final String TRAVEL_ID   = "8";
        public static final String EATING_ID   = "7";
        public static final String FASHION_ID  = "6";
        public static final String TECH_ID     = "10";
        public static final String HEALTH_ID   = "9";
    }

    /**
     * Category IDs for UAT
     */
//    public static class RewardCategoryIDs {
//        public static final String EVENT_ID    = "8";
//        public static final String TRAVEL_ID   = "2";
//        public static final String EATING_ID   = "3";
//        public static final String FASHION_ID  = "4";
//        public static final String TECH_ID     = "5";
//        public static final String HEALTH_ID   = "7";
//    }

    public static class NetworkConnection {
        public static final int TYPE_WIFI             = 1;
        public static final int TYPE_MOBILE           = 2;
        public static final int TYPE_NOT_CONNECTED    = 0;
    }

    public static final String GOOGLE_TRACKING_ID = "UA-59156588-1";

    public static final String IS_OPENED_AFTER_LOGGED_IN = "from_login";

    public static final int POSITION_HOME_ADDRESS   = 0;
    public static final int POSITION_OFFICE_ADDRESS = 1;

    public static final String IS_MAIN_OPENED_AFTER_LOGGED_IN   = "from_login";
    public static final String IS_PROFILE_OPENED_FROM_BASKET    = "from_basket";
    public static final String FORGOT_TITLE                     = "forgot_title";
    public static final String FORGOT_FROM_ACTIVITY_SOURCE      = "forgot_activity_source";
    public static final String REGISTER_ACTIVITY_SOURCE         = "register_activity_source";
    public static final String FIRST_NAME                       = "first_name";
    public static final String LAST_NAME                        = "last_name";
    public static final String CARD_NUMBER                      = "card_number";
    public static final String PIN                              = "pin";

    //public static final String BEACON_UUID = "E2C56DB5-DFFB-48D2-B060-D0F5A71096E0";
//    public static final String BEACON_UUID = "b9407f30-f5f8-466e-aff9-25556b57fe6d";
    //public static final String BEACON_UUID = "E5868BCA-C9BC-4084-A6FC-85D980AE7377";
    public static final String BEACON_UUID = "D044FF17-6825-4986-B7A2-C6D6255B596F";

    public static class ContactDetails {
        public static final String CONTACT_PHONE        = "01245 567 1234";
        public static final String CONTACT_EMAIL        = "scott.seaborn@aimia.com";
        public static final String CONTACT_FACEBOOK_ID  = "fb://page/195601040506049";
        public static final String CONTACT_FACEBOOK     = "https://www.facebook.com/AimiaInc";
        public static final String CONTACT_TWITTER      = "https://twitter.com/AimiaInc";
    }

    public static final String AIMIA_EXTERNAL_STORAGE_MEDIA_FOLDER  = "AimiaAlphaMedia";
    public static final String AIMIA_INTERNAL_STORAGE_IMAGES_FOLDER = "profilePictures";
    public static final String AIMIA_INTERNAL_STORAGE_AUDIO_FOLDER  = "notificationSounds";

    public static class RateMyApp {
        public final static int DAYS_UNTIL_PROMPT      = 3;//Min number of days
        public final static int LAUNCHES_UNTIL_PROMPT  = 3;//Min number of launches
        public final static int DAYS_UNTIL_REMIND      = 7;//Interval for reminder
    }

    public static class Search {
        public static final int ZOOM_LEVEL_IN_KILOMETERS    = 1;
        public static final String OFFER_TAB                = "offer_tab";
        public static final String REWARD_TAB               = "reward_tab";
        public static final String STORE_TAB                = "store_tab";
        public static final String REWARDS_LIST             = "rewards_list";
        public static final String SELECTED_REWARD          = "selected_reward";
        public static final String GOOGLE_PLACE_DETAILS_URl = "https://maps.googleapis.com/maps/api/place/details/";
        public static final String GOOGLE_NAV_URl           = "http://maps.google.com/maps?daddr=";
        public static final String GOOGLE_PLACE_PHOTO_URl   = "https://maps.googleapis.com/maps/api/place/photo?";
        public static final String GOOGLE_AUTOCOMPLETE_URl  = "https://maps.googleapis.com/maps/api/place/autocomplete/";
    }

    public static class AppLinksForSharing {
        public static final String APP_LINKS_URL        = "https://fb.me/401174326755613";
        public static final String APP_LINKS_BUNDLE     = "al_applink_data";
        public static final String APP_LINKS_TARGET_URL = "target_url";
    }

    public static class Gamification {
        public static final String BASE_URL         = "https://live-alp.psona.social/";
        public static final String FORBIDDEN_URL    = "https://live-alp.psona.social/error/Forbidden";
    }

    public static class FacebookConstants {
        public static final String PERMISSIONS      = "email";
        public static final String GRAPH_API_FIELDS = "id, name, first_name, middle_name, last_name";
        public static final String FACEBOOK_EMAIL   = "email";

        public static final String FACEBOOK_BUTTON_STATE_LOGIN      = "login";
        public static final String FACEBOOK_BUTTON_STATE_REGISTER   = "register";
        public static final String FACEBOOK_BUTTON_STATE_RESET      = "";
    }
}
