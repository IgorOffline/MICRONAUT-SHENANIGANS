console.log("hello!");

async function helloFetch() {
    fetch("/e/hello").then(async response => {
        console.log(`response.status= ${response.status}`);
        response.text().then(responseText => console.log(responseText)).catch(errorInner => console.log(`errorInner= ${errorInner}`));
    }).catch(errorOuter => console.log(`errorOuter= ${errorOuter}`));
}