# IBM Website Navigation – Shadow DOM Handling

## 📌 Objective
Automate navigation on the IBM website:
1. Visit [IBM India Website](https://www.ibm.com/in-en)  
2. Open the **Hybrid Cloud** menu from the header dropdown.  
3. Select **IT Infrastructure** from the submenu.

---

## 🛠 Tech Stack
- Java 11  
- Selenium 4.33.0  
- WebDriverWait  
- Locators: CSS Selector & XPath

---

## ⚠ Challenge Faced
The elements inside the header menu were encapsulated within a **Shadow DOM**, making them inaccessible via standard XPath locators.

---

## 📚 Key Learnings
1. **Why Shadow DOM?**  
   - Keeps outer DOM unaffected by inner DOM changes.  
   - Prevents CSS leakage between components.  
   - Ensures component styling consistency.  

2. **How to Interact with Shadow Elements in Selenium:**  
   - Use **CSS selectors only** (XPath won't work inside Shadow DOM).  
   - Locate parent element normally (XPath/CSS).  
   - Access shadow root:  
     ```java
     SearchContext shadowRoot = parentElement.getShadowRoot();
     ```
   - From `SearchContext`, locate child elements using CSS selectors.

3. **CSS Selector Refresh:**  
   - By ID: `#idValue`  
   - By class: `.className`  
   - By attribute: `tag[attribute='value']`  
   - Wildcards:  
     - `*=` contains text  
     - `^=` starts with text  
     - `$=` ends with text  

4. **Debugging Tip:**  
   Pause DOM in DevTools → **Sources → Event Listener Breakpoints → Mouse → dblclick**.

---

## 📺 Demo
![Demo](IBMAutomationAssignment.gif)

---

## 📂 Project Structure
```
IBMAutomationAssignment/
├── .settings/
├── src/
│ └── main/
│ └── java/
│ └── com/
│ └── shadow/
│ ├── IBMAutomation.java
│ └── ShadowDemoAssignment.java
├── .classpath
├── .gitignore
├── .project
├── pom.xml
└── README.md
```


---

## ▶ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/NitishBahe/IBMAutomationAssignment.git
2. Open the project in your IDE (IntelliJ/Eclipse).
3. Install dependencies via Maven:
   ```bash
   mvn clean install
4. Run the test file:
```bash
   mvn test
```
---
## 🙏 Acknowledgements
Special thanks to Jatin for his guidance and valuable inputs during this assignment. His suggestions made navigating and interacting with Shadow DOM elements much more effective.
