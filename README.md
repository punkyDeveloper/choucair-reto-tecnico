# Choucair - Reto Técnico QA Automation

Automatización Web sobre [Demo Web Shop Tricentis](https://demowebshop.tricentis.com/)

## Tecnologías
| Herramienta | Versión |
|---|---|
| Java | 15.0.2 |
| Gradle | 7.6 |
| Serenity BDD | 4.2.34 |
| Cucumber | 7.11.1 |
| JUnit | 4.13.2 |
| Selenium | 4.33.0 (incluido en Serenity) |
| ChromeDriver | Auto-descarga |

## Estructura del proyecto
```
src/test/java/com/choucair/
├── runners/          → TestRunner.java
├── stepdefinitions/  → Hooks, RegistrationStepDefinitions, PurchaseStepDefinitions
├── tasks/            → Register, Login, AddProductToCart, ProceedToCheckout,
│                       CompleteBillingAddress, SelectCreditCard, CompletePayment, ConfirmOrder
├── questions/        → RegistrationMessage, OrderMessage
└── ui/               → RegistrationPage, LoginPage, ProductPage, CheckoutPage

src/test/resources/
├── features/
│   ├── registro.feature
│   └── compra.feature
└── serenity.conf
```

## Configuración previa

### Variables de entorno
Antes de ejecutar, configura el JAVA_HOME en tu terminal:
```powershell
$env:JAVA_HOME = "C:\Program Files\java\jdk-15.0.2_windows-x64_bin\jdk-15.0.2"
```

### Credenciales de prueba
Actualiza el email en `PurchaseStepDefinitions.java` con el usuario registrado en el Bloque 1:
```java
Login.withCredentials("tu-email@test.com", "Test1234!")
```

## Ejecución
```powershell
.\gradlew clean test
```

## Bloques automatizados

**Bloque 1 - Registro**
- Navega a Demo Web Shop
- Registra un nuevo usuario con datos válidos
- Valida el mensaje `"Your registration completed"`

**Bloque 2 - Compra**
- Login con credenciales registradas
- Navega a Computers → Desktops
- Agrega producto al carrito
- Completa checkout con datos de entrega
- Pago con tarjeta Visa (Barbara Gordon)
- Valida el mensaje `"Your order has been successfully processed!"`

## Reportes
Los reportes se generan en:
```
build/reports/tests/test/index.html
```
