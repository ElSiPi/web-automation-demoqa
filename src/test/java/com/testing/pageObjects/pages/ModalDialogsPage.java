package com.testing.pageObjects.pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("/modal-dialogs")
public class ModalDialogsPage extends AlertsFrameAndWindowsPage {

    // Locators ----------------------------------------------------------------------------------------------------------
    public static By MODAL_DIALOGS_TITLE = text("Modal Dialogs");
    public static By SMALL_MODAL_BUTTON = id("showSmallModal");
    public static By LARGE_MODAL_BUTTON = id("showLargeModal");
    // When a new tab or window is opened, it contains a two exit options.
    public static By RESULT = css("div[class='modal-body']");
    public static By CLOSE_SMALL_BUTTON = id("closeSmallModal");
    public static By DISMISS_LARGE_BUTTON = xpath("/html/body/div[3]/div/div/div[1]/button");

    // Public methods ----------------------------------------------------------------------------------------------------
    public void waitForPageToLoad() {
        getElement(MODAL_DIALOGS_TITLE).waitUntilPresent();
        logWeAreOnPage();
        }
    }

