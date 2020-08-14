package Framework;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ConsultarPedido.Consulta;
import _CORE.DriverFactory;

public class _Framework extends DriverFactory {
	
	public void url (String url) {
		
		driver.manage().window().maximize();
		driver.get(url);
		
	}
	
	public void email (String email) {
		
		driver.findElement(By.xpath("//input[@id = 'ap_email']")).sendKeys(email);
		
	}
	
	public void btnContinue () {
		
		driver.findElement(By.xpath("//input[@id = 'continue']")).click();
		
	}
	
	public void senha (String senha) {
		
		driver.findElement(By.xpath("//input[@id = 'ap_password']")).sendKeys(senha);
		
	}
	
	public void fazerlogin () {
		
		driver.findElement(By.xpath("//input[@id = 'signInSubmit']")).click();
	
	}
	
	public String validarLogin () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id = 'nav-logo']")));
		Thread.sleep(1000);
		return driver.findElement(By.xpath("//span[text() = 'Olá, Maria']")).getText();
		
	}
	
 //-------------------------------------------------------------------------------------------------------------------------------------------//
	
	public void campopesquisa (String campopesquisa) {
				
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys(campopesquisa);
		
	}
	
	public void lupa () {
		
		driver.findElement(By.xpath("//input[@value = 'Ir']")).click();
		
	}
	
	public void marca () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text() = 'Xiaomi']")));
		driver.findElement(By.xpath("//span[text() = 'Xiaomi']")).click();
		
	}
	
	public void celular () throws InterruptedException {
		
		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'a-section a-spacing-none a-spacing-top-small'])[1]/h2/a")));
		driver.findElement(By.xpath("(//div[@class = 'a-section a-spacing-none a-spacing-top-small'])[1]/h2/a")).click();
		
	}
	
	public void cor () {

		WebDriverWait wait = new WebDriverWait(driver, 15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@class = 'imgSwatch'])[2]")));
		driver.findElement(By.xpath("(//img[@class = 'imgSwatch'])[2]")).click();
		
	}
	
	public void comprarAgora () {
		
		driver.findElement(By.xpath("//input[@id = 'buy-now-button']")).click();
		
	}
	
	public void nome (String nome) {
		
		driver.findElement(By.xpath("(//input[@id = 'enterAddressFullName'])[1]")).sendKeys(nome);
		
	}
	
	public void telefone (String telefone) {
		
		driver.findElement(By.xpath("(//input[@id = 'enterAddressPhoneNumber'])[1]")).sendKeys(telefone);
		
	}
	
	public void cep (String cep) {
		
		driver.findElement(By.xpath("(//input[@id = 'enterAddressPostalCode'])[1]")).sendKeys(cep);
		
	}
	
	public void validarCep () {
		
		driver.findElement(By.xpath("//input[@value = 'Validar CEP']")).click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value = 'Validar CEP']")));
		
	}
	
	public void numeroCasa (String numeroCasa) {
		
		driver.findElement(By.xpath("//input[@id = 'enterAddressBuildingNumber']")).sendKeys(numeroCasa);
		
	}
	
	public void continuar () {
		
		driver.findElement(By.xpath("(//input[@value = 'Continuar'])[1]")).click();
		
	}
	
	public void cpf (String cpf) {
		
		driver.findElement(By.xpath("(//input[@id = 'taxid-field'])[1]")).sendKeys(cpf);
		
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------//
	
	public void carinho () {
		
		driver.findElement(By.xpath("//span[@id = 'nav-cart-count']")).click();
		
	}
	
	public void excluir () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value = 'Excluir']")));	
		driver.findElement(By.xpath("//input[@value = 'Excluir']")).click();
		
		
	}
	
//------------------------------------------------------------------------------------------------------------------------------------------//	
		
	public void produto1 (String produto1) throws InterruptedException {
		
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'twotabsearchtextbox']")));	
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys(produto1);
		lupa();
		Consulta.textoProduto1 = driver.findElement(By.xpath("(//div[@class = 'a-section a-spacing-medium'])[1]")).getText();
		
	}
	
	public void produto2 (String produto2) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'twotabsearchtextbox']")));	
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys(produto2);
		lupa();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 's-expand-height s-include-content-margin s-border-bottom s-latency-cf-section'])[1]")));
		Consulta.textoProduto2 = driver.findElement(By.xpath("(//div[@class = 's-expand-height s-include-content-margin s-border-bottom s-latency-cf-section'])[1]")).getText();
		
	}
	
	public void produto3 (String produto3) {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'twotabsearchtextbox']")));	
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).clear();
		driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']")).sendKeys(produto3);
		lupa();
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 's-include-content-margin s-border-bottom s-latency-cf-section'])[1]")));	
		Consulta.textoProduto3 = driver.findElement(By.xpath("(//div[@class = 's-include-content-margin s-border-bottom s-latency-cf-section'])[1]")).getText();
		
	}
	
//-------------------------------------------------------------------------------------------------------------------------------------------//
	
	
	public void listas () {

		WebElement element = driver.findElement(By.xpath("(//span[@style = 'visibility: visible;'])[1]"));
		Actions action = new Actions(driver).moveToElement(element);
		action.build().perform();
		
	}
	
	public void conta () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text() = 'Sua conta']")));		
		driver.findElement(By.xpath("//span[text() = 'Sua conta']")).click();
		
	}
	
	public void acesso () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class = 'a-box ya-card--rich'])[2]")));	
		driver.findElement(By.xpath("(//div[@class = 'a-box ya-card--rich'])[2]")).click();
		
	}
	
	public void editar () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'auth-cnep-edit-name-button']")));
		driver.findElement(By.xpath("//input[@id = 'auth-cnep-edit-name-button']")).click();
		
	}
	
	public void alterarCampo (String alterarNome) {
		
		driver.findElement(By.xpath("//input[@id = 'ap_customer_name']")).clear();
		driver.findElement(By.xpath("//input[@id = 'ap_customer_name']")).sendKeys(alterarNome);
		
	}
	
	public void salvar () {
		
		driver.findElement(By.xpath("//input[@id = 'cnep_1C_submit_button']")).click();
		
	}
			
	public String validaAlteracao () {
		
		return driver.findElement(By.xpath("(//div[@class = 'a-row'])[2]")).getText();
		
	}
	
	public String validarConfirmacaoAlteracao () {
		
		return driver.findElement(By.xpath("//div[@id = 'auth-success-message-box']")).getText();
		
	}
			
	public void concluido () {
		
		driver.findElement(By.xpath("//span[@id = 'a-autoid-7']")).click();
		
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------//
	
	public void sair () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id = 'nav-item-signout']")));
        driver.findElement(By.xpath("//a[@id = 'nav-item-signout']")).click();
		
	}
	
	public String validarLogout () {
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h1[@class = 'a-spacing-small']")));
		return driver.findElement(By.xpath("//h1[@class = 'a-spacing-small']")).getText();
		
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------//
	
	public void pageDonw () throws InterruptedException {
		
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy ( 0, 10000 )");
			
	}
	
	public void carreiras () {
		
		driver.findElement(By.xpath("//a[text() = 'Carreiras']")).click();
		
	}
	
	public void X () throws InterruptedException {
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class = 'close-button py-2 px-4']")).click();
		
	}
	
	public void local (String local) {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@role = 'combobox'])[4]")));
		driver.findElement(By.xpath("(//input[@role = 'combobox'])[4]")).sendKeys(local);
		
	}
	
	public void procurar () {
		
		driver.findElement(By.xpath("//button[@id = 'search-button']")).click();
		
	}
	
	public void desenvolvimentoSoftware () {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[p/text()=\"Desenvolvimento de software\"])[1]")));
		driver.findElement(By.xpath("(//*[p/text()=\"Desenvolvimento de software\"])[1]")).click();
		
	}
	
	public void proximo () {
		
		driver.findElement(By.xpath("//button[@class = 'btn circle right']")).click();
			
	}
	
	public void classificar () {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'dropdown']")));
		driver.findElement(By.xpath("//div[@class = 'dropdown']")).click();
		
	}
	
	public void recente () {
		
		
		driver.findElement(By.xpath("//a[@id = 'recent']")).click();
		
	}
	
//----------------------------------------------------------------------------------------------------------------------------------------------//	
	
	
	public void menu () {
		
		driver.findElement(By.xpath("//a[@id = \"nav-hamburger-menu\"]")).click();
		
	}
	
	public void cozinha () {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class = 'hmenu-item']/div[text() = 'Cozinha ']")));
		driver.findElement(By.xpath("//a[@class = 'hmenu-item']/div[text() = 'Cozinha ']")).click();
	
	}
	
	public void panelas () {
		
		driver.findElement(By.xpath("//a[@class = 'hmenu-item'][text() = 'Panelas ']")).click();
		
	}
	
	public void prime () {
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name = 's-ref-checkbox-19171728011']")));
		driver.findElement(By.xpath("//input[@name = 's-ref-checkbox-19171728011']")).click();
		
	}
	
	
	
	
	
}
