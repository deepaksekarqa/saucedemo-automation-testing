# 🛒 SauceDemo – E-Commerce Automation Testing

![Java](https://img.shields.io/badge/Java-17-orange?style=flat-square&logo=java)
![Selenium](https://img.shields.io/badge/Selenium-4.18.1-green?style=flat-square&logo=selenium)
![TestNG](https://img.shields.io/badge/TestNG-7.11.0-red?style=flat-square)
![Maven](https://img.shields.io/badge/Maven-3.x-blue?style=flat-square&logo=apachemaven)
![Status](https://img.shields.io/badge/Tests-5%2F5%20Passed-brightgreen?style=flat-square)

---

## 📌 Project Overview

End-to-end **Selenium automation framework** for the Sauce Labs demo e-commerce application.  
This is the **foundation project** of the portfolio — demonstrating Page Object Model, TestNG annotations, priority ordering, and assertion-based validation.

**Application Under Test:** https://www.saucedemo.com/

---

## 🎯 Test Cases Covered

| # | Test Method | Description | Result |
|---|------------|-------------|--------|
| 1 | testLogin | Login with valid credentials | ✅ PASSED |
| 2 | testAddToCart | Add product to cart | ✅ PASSED |
| 3 | testCheckout | Enter checkout information | ✅ PASSED |
| 4 | testOrderValidation | Validate order confirmation message | ✅ PASSED |
| 5 | testLogout | Logout successfully | ✅ PASSED |

**Total: 5/5 Passed — 0 Failures — 0 Skips**

---

## 🛠️ Tech Stack

| Technology | Version | Purpose |
|-----------|---------|---------|
| Java | 17 | Programming language |
| Selenium WebDriver | 4.18.1 | Browser automation |
| TestNG | 7.11.0 | Test framework, assertions, annotations |
| Maven | 3.x | Build tool and dependency management |
| WebDriverManager | 5.7.0 | Automatic ChromeDriver management |

---

## 📁 Project Structure

```
SauceDemoAutomation/
├── src/
│   ├── main/java/
│   │   ├── base/
│   │   │   └── BaseClass.java          ← static WebDriver, @BeforeClass, @AfterClass
│   │   └── pages/
│   │       ├── LoginPage.java          ← Login module
│   │       ├── ProductsPage.java       ← Add to cart module
│   │       ├── CartPage.java           ← Cart module
│   │       ├── CheckoutPage.java       ← Checkout module
│   │       └── OrderPage.java          ← Order confirmation module
│   └── test/java/
│       └── tests/
│           └── TestRun.java     ← 5 @Test methods
├── pom.xml
└── testng.xml
```

---

## ⚙️ Prerequisites

- Java 17 or higher installed
- Maven 3.x installed
- Google Chrome browser installed

---

## 🚀 How to Run

### Option 1 — Run from Eclipse IDE

1. Clone this repository
   ```bash
   git clone https://github.com/deepaksekarqa/saucedemo-automation-testing.git
   ```
2. Open Eclipse → **File → Import → Maven → Existing Maven Project**
3. Right click `testng.xml` → **Run As → TestNG Suite**

### Option 2 — Run from Command Line (Maven)

```bash
# Clone the repo
git clone https://github.com/deepaksekarqa/saucedemo-automation-testing.git

# Navigate into project
cd saucedemo-automation-testing

# Run tests
mvn test
```

---

## 📊 Test Results

```
===============================================
SauceDemo Test Suite
Total tests run: 5, Passes: 5, Failures: 0, Skips: 0
===============================================
```

---

## 🔑 Key Implementation Highlights

- **Page Object Model** — separate page class per module, centralised locators
- **TestNG priority ordering** — `@Test(priority=1)` through `(priority=5)` controls execution sequence
- **Assert.assertEquals** — validates order confirmation message text at test step level
- **@BeforeClass / @AfterClass** — browser setup and teardown managed in BaseClass
- **WebDriverManager** — eliminates manual ChromeDriver path configuration

---

## ⚠️ Important Notes

- Login credentials used are the public SauceDemo demo credentials — no real user data
- SLF4J and CDP warnings in console are harmless and do not affect test execution

---

## 👨‍💻 Author

**Deepak S** — QA Engineer (Automation & Manual Testing)  
📍 Chennai, India  
🔗 [LinkedIn](https://www.linkedin.com/in/deepaksekar7/) | [GitHub](https://github.com/deepaksekarqa/)

---

