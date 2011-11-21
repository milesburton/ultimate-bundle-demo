package com.milesburton.ultimate.geb.pages

import geb.Page

class WakeUpWorldPage extends Page {            // pages can define their location, either absolutely or relative to a base
    static url = "wakeup"

    // “at checkers” allow verifying that the browser is at the expected page
    static at = { content == "Wake Up World"}
}
