# Shopping List App

Grocery shopping is something that everyone has to do, and it takes time to remember everything to buy, determine the lowest price of the items, and locate stores that have the desired groceries. Therefore, our goal is to create an Android app that will make remembering, finding, and purchasing groceries easy, fast, and simple. 

## Functionality

Users can access a shopping cart where they can register items that they need to pick up at the store.
Users have a search bar where they can search for items
Users can view the availability and the price of each item at different stores.
Users can see past groceries as a reference to see what they need this week.
Users can see a total price that is updated as you add items to your cart

## Components

Backend: We will write the backend in Kotlin. All of our members have had experiences with Kotlin in the past and we are aware that Kotlin is great for Android app development. We will be using SQL databases for our application and then deliver the necessary implementation to provide features that our users will use such as:
Shopping cart
Search bar
Availability/price of items
History of past groceries
Total Amount

Libraries:  We will utilize the Ktorm library because it will help keep our code clean as we work with the SQL database. Furthermore, Ktorm allows for data manipulation with the database that would be difficult without. Ktorm utilizes queries which will help us access and iterate over the data efficiently while implementing our search bar for grocery items. The Ktorm queries can filter data based on multiple conditions which is useful for a more advanced searching mechanism. Another library we will utilize is the Android-KTX which leverages the features of Kotlin to help make code more concise and will help us to avoid repetitive code. Android KTX includes extensions that provide support for app development with Android Studio Code.

Frontend: We will use Android Studio to design the user interface. We will use Kotlin for the user interface because it is great for mobile/android development and ensures that all the functions of our app are accurately reflected in the user interface and that the users can access all of these features without any bugs. Also we will implement method calls to communicate between frontend and backend because of our lack of experience in other forms of communication between components.

Users will make their command on the app through the interface and this will send a request to the backend and the request handler will manage this request by accessing the SQL database to search for the information the user wants and then show the results on the Groceries App.

## Schedule

Week 1: Locate databases from major stores to use in our shopping application, set up the collaborative working environment
Week 2: Manipulate, organize and store necessary data from store databases, construct class skeletons and include any necessary function definitions
Week 3: Develop a searching mechanism for items and stores, design a search bar that loads in relevant items
Week 4: Provide advanced searching options based on user priorities (proximity, price, etc.), enhance the search bar to include these options
Week 5: Create a virtual shopping cart for users to add and remove items, build a virtual shopping cart in the user interface
Week 6: Maintain data on user history to provide recommendations, update the search algorithm to prioritize recommendations
Week 7: Connect all the components of the application in the user interface, incorporate additional features for the shopping application
Week 8: Finalize the user interface for the application, continue adding unique features to the application

## Risks

Stores may not have publicly accessible databases which would prevent us from collecting data from multiple sources so that it is available in one location. If this were to occur, we could create our own example database and focus on the functionality of the application.

Another problem we might encounter is developing the user interfaces, as none of us really have experience with frontend development, so that might be something we have to pick up on and implement. This might be a long process because there’s quite a bit of UI design we have planned out and if things do not work out we could always cut out some features to make our goals more achievable.

We may have issues aligning backend with frontend as we have minimal exposure to doing this previously (CS124) and may need additional assistance to guide us through this process. If we do run into issues, there are plenty of online resources available that we could look at to help us through this process. If we continue to struggle with this alignment, we could use code from our past projects as a template.

## Teamwork
We will all use Android Studio since we are developing in Kotlin (any editor is fine though). Also we will use a Docker environment to ensure we have similar development environments and tools.

Our team currently consists of John, Stephen, Aaron, and Ohm. Ohm has the most experience with frontend development, so he will handle most of our interface design and the other three will focus on backend development. We will also rotate our roles and help Ohm with frontend development, so that we are proficient in all components of our project. I think our task distribution will be mostly based on availability and we will assign tasks to whoever can afford time to work on it during the week/weekend. (Subject to change if our productivity levels are low and need improvement).
