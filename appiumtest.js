// Setup the testing
const wdio = require("webdriverio");
const opts = {
    port: 4723,
    capabilities: {
      platformName: "Android",
      platformVersion: "8.0",
      deviceName: "Android Emulator",
      app: "/path/to/the/downloaded/ApiDemos.apk",
      automationName: "UiAutomator2"
    }
  };
  
const client = wdio.remote(opts);

// Start screenrecording
await wdio.startRecordingScreen();

// Running the test cases
const elementId = await client.findElement("accessibility id","TextField1");
client.elementSendKeys(elementId.ELEMENT, "Hello World!"); 
const elementValue = await client.findElement("accessibility id","TextField1");
await client.getElementAttribute(elementValue.ELEMENT,"value").then((attr) => {
assert.equal(attr,"Hello World!");
});