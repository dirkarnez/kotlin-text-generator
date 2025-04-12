import kotlin.random.Random

class Graph<T> {
    private val adjacencyList: MutableMap<T, MutableList<T>> = mutableMapOf()

    // Add a vertex to the graph
    fun addVertex(vertex: T) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, mutableListOf<T>())
        }
    }

    // Add an edge to the graph (directed)
    fun addEdge(source: T, destination: T) {
        addVertex(source)
        addVertex(destination)
        adjacencyList[source]?.add(destination)
    }

    // Print the adjacency list
    fun printGraph() {
        for ((vertex, edges) in adjacencyList) {
            println("$vertex -> $edges")
        }
    }

    fun generate(): List<T> {
        var list: List<Pair<T, MutableList<T>>> = adjacencyList.toList()

        val result: MutableList<T> = mutableListOf<T>()

        var token = list.get(Random.nextInt(0, list.size - 1)).first

        var nextTokenList: MutableList<T>? = mutableListOf<T>()

        while (adjacencyList.containsKey(token)) {
            nextTokenList = adjacencyList.get(token)
            if (nextTokenList == null) {
                break
            }

            if (nextTokenList.size < 1) {
                break
            }
            result.add(token)
            token = nextTokenList.get(Random.nextInt(0, nextTokenList.size))
        }
        result.add(token)
        return result
    }

    fun generateAsString(): String {
        return sentenceCase(generate().joinToString(separator = " "))
    }
}

// fun main() {
//     val graph = Graph<String>()
//     graph.addEdge("1a", "2a")
//     graph.addEdge("1a", "3a")
//     graph.addEdge("2a", "4a")
//     graph.addEdge("3a", "4a")

//     graph.printGraph()
// }

// quote generator
fun main() {
    val AI_Model = Graph<String>()
    AI_Training("You may say I'm a dreamer, but I'm not the only one. I hope someday you'll join us. And the world will live as one.", AI_Model)
    AI_Training("Hold fast to dreams, For if dreams die Life is a broken-winged bird, That cannot fly.", AI_Model)
    AI_Training("All that we see or seem is but a dream within a dream.", AI_Model)
    AI_Training("I like the night. Without the dark, we'd never see the stars.", AI_Model)
    AI_Training("I dream my painting and I paint my dream.", AI_Model)
    AI_Training("I dream. Sometimes I think that's the only right thing to do.", AI_Model)
    AI_Training("Hope is a waking dream.", AI_Model)
    AI_Training("Dreams are the touchstones of our characters.", AI_Model)
    AI_Training("Some people see things that are and ask, Why? Some people dream of things that never were and ask, Why not? Some people have to go to work and don't have time for all that.", AI_Model)
    AI_Training("Surround Yourself with People Who Believe in Your Dreams: Surround yourself with people who believe in your dreams, encourage your ideas, support your ambitions, and bring out the best in you.", AI_Model)
    AI_Training("No matter how your heart is grieving, if you keep on believing, the dreams that you wish will come true.", AI_Model)
    AI_Training("If you can dream it, you can do it. Always remember that this whole thing was started with a dream and a mouse.", AI_Model)
    AI_Training("Life isn't about getting and having, it's about giving and being.", AI_Model)
    AI_Training("Whatever the mind of man can conceive and believe, it can achieve.", AI_Model)
    AI_Training("Strive not to be a success, but rather to be of value.", AI_Model)
    AI_Training("Two roads diverged in a wood, and I—I took the one less traveled by, And that has made all the difference.", AI_Model)
    AI_Training("I attribute my success to this: I never gave or took any excuse.", AI_Model)
    AI_Training("You miss 100% of the shots you don't take.", AI_Model)
    AI_Training("I've missed more than 9000 shots in my career. I've lost almost 300 games. 26 times I've been trusted to take the game winning shot and missed. I've failed over and over and over again in my life. And that is why I succeed.", AI_Model)
    AI_Training("The most difficult thing is the decision to act, the rest is merely tenacity.", AI_Model)
    AI_Training("Every strike brings me closer to the next home run.", AI_Model)
    AI_Training("Definiteness of purpose is the starting point of all achievement.", AI_Model)
    AI_Training("We must balance conspicuous consumption with conscious capitalism.", AI_Model)
    AI_Training("Life is what happens to you while you're busy making other plans.", AI_Model)
    AI_Training("We become what we think about.", AI_Model)
    AI_Training("Twenty years from now you will be more disappointed by the things that you didn't do than by the ones you did do, so throw off the bowlines, sail away from safe harbor, catch the trade winds in your sails.  Explore, Dream, Discover.", AI_Model)
    AI_Training("Life is 10% what happens to me and 90% of how I react to it.", AI_Model)
    AI_Training("The most common way people give up their power is by thinking they don't have any.", AI_Model)
    AI_Training("The mind is everything. What you think you become.", AI_Model)
    AI_Training("The best time to plant a tree was 20 years ago. The second best time is now.", AI_Model)
    AI_Training("An unexamined life is not worth living.", AI_Model)
    AI_Training("Eighty percent of success is showing up.", AI_Model)
    AI_Training("Your time is limited, so don't waste it living someone else's life.", AI_Model)
    AI_Training("Winning isn't everything, but wanting to win is.", AI_Model)
    AI_Training("I am not a product of my circumstances. I am a product of my decisions.", AI_Model)
    AI_Training("Every child is an artist.  The problem is how to remain an artist once he grows up.", AI_Model)
    AI_Training("You can never cross the ocean until you have the courage to lose sight of the shore.", AI_Model)
    AI_Training("I've learned that people will forget what you said, people will forget what you did, but people will never forget how you made them feel.", AI_Model)
    AI_Training("Either you run the day, or the day runs you.", AI_Model)
    AI_Training("Whether you think you can or you think you can't, you're right.", AI_Model)
    AI_Training("The two most important days in your life are the day you are born and the day you find out why.", AI_Model)
    AI_Training("Whatever you can do, or dream you can, begin it.  Boldness has genius, power and magic in it.", AI_Model)
    AI_Training("The best revenge is massive success.", AI_Model)
    AI_Training("People often say that motivation doesn't last. Well, neither does bathing.  That's why we recommend it daily.", AI_Model)
    AI_Training("Life shrinks or expands in proportion to one's courage.", AI_Model)
    AI_Training("If you hear a voice within you say you cannot paint then by all means paint and that voice will be silenced.", AI_Model)
    AI_Training("There is only one way to avoid criticism: do nothing, say nothing, and be nothing.", AI_Model)
    AI_Training("Ask and it will be given to you; search, and you will find; knock and the door will be opened for you.", AI_Model)
    AI_Training("The only person you are destined to become is the person you decide to be.", AI_Model)
    AI_Training("Go confidently in the direction of your dreams.  Live the life you have imagined.", AI_Model)
    AI_Training("When I stand before God at the end of my life, I would hope that I would not have a single bit of talent left and could say, I used everything you gave me.", AI_Model)
    AI_Training("Few things can help an individual more than to place responsibility on him, and to let him know that you trust him.", AI_Model)
    AI_Training("Certain things catch your eye, but pursue only those that capture the heart.", AI_Model)
    AI_Training("Believe you can and you're halfway there.", AI_Model)
    AI_Training("Everything you've ever wanted is on the other side of fear.", AI_Model)
    AI_Training("We can easily forgive a child who is afraid of the dark; the real tragedy of life is when men are afraid of the light.", AI_Model)
    AI_Training("Teach thy tongue to say, I do not know, and thous shalt progress.", AI_Model)
    AI_Training("Start where you are. Use what you have.  Do what you can.", AI_Model)
    AI_Training("When I was 5 years old, my mother always told me that happiness was the key to life.  When I went to school, they asked me what I wanted to be when I grew up.  I wrote down 'happy'.  They told me I didn't understand the assignment, and I told them they didn't understand life.", AI_Model)
    AI_Training("Fall seven times and stand up eight.", AI_Model)
    AI_Training("When one door of happiness closes, another opens, but often we look so long at the closed door that we do not see the one that has been opened for us.", AI_Model)
    AI_Training("Everything has beauty, but not everyone can see.", AI_Model)
    AI_Training("How wonderful it is that nobody need wait a single moment before starting to improve the world.", AI_Model)
    AI_Training("When I let go of what I am, I become what I might be.", AI_Model)
    AI_Training("Life is not measured by the number of breaths we take, but by the moments that take our breath away.", AI_Model)
    AI_Training("Happiness is not something readymade.  It comes from your own actions.", AI_Model)
    AI_Training("If you're offered a seat on a rocket ship, don't ask what seat! Just get on.", AI_Model)
    AI_Training("First, have a definite, clear practical ideal; a goal, an objective. Second, have the necessary means to achieve your ends; wisdom, money, materials, and methods. Third, adjust all your means to that end.", AI_Model)
    AI_Training("If the wind will not serve, take to the oars.", AI_Model)
    AI_Training("You can't fall if you don't climb.  But there's no joy in living your whole life on the ground.", AI_Model)
    AI_Training("We must believe that we are gifted for something, and that this thing, at whatever cost, must be attained.", AI_Model)
    AI_Training("Too many of us are not living our dreams because we are living our fears.", AI_Model)
    AI_Training("Challenges are what make life interesting and overcoming them is what makes life meaningful.", AI_Model)
    AI_Training("If you want to lift yourself up, lift up someone else.", AI_Model)
    AI_Training("I have been impressed with the urgency of doing. Knowing is not enough; we must apply. Being willing is not enough; we must do.", AI_Model)
    AI_Training("Limitations live only in our minds.  But if we use our imaginations, our possibilities become limitless.", AI_Model)
    AI_Training("You take your life in your own hands, and what happens? A terrible thing, no one to blame.", AI_Model)
    AI_Training("What's money? A man is a success if he gets up in the morning and goes to bed at night and in between does what he wants to do.", AI_Model)
    AI_Training("I didn't fail the test. I just found 100 ways to do it wrong.", AI_Model)
    AI_Training("In order to succeed, your desire for success should be greater than your fear of failure.", AI_Model)
    AI_Training("A person who never made a mistake never tried anything new.", AI_Model)
    AI_Training("The person who says it cannot be done should not interrupt the person who is doing it.", AI_Model)
    AI_Training("There are no traffic jams along the extra mile.", AI_Model)
    AI_Training("It is never too late to be what you might have been.", AI_Model)
    AI_Training("You become what you believe.", AI_Model)
    AI_Training("I would rather die of passion than of boredom.", AI_Model)
    AI_Training("A truly rich man is one whose children run into his arms when his hands are empty.", AI_Model)
    AI_Training("It is not what you do for your children, but what you have taught them to do for themselves, that will make them successful human beings.", AI_Model)
    AI_Training("If you want your children to turn out well, spend twice as much time with them, and half as much money.", AI_Model)
    AI_Training("Build your own dreams, or someone else will hire you to build theirs.", AI_Model)
    AI_Training("The battles that count aren't the ones for gold medals. The struggles within yourself - the invisible battles inside all of us - that's where it's at.", AI_Model)
    AI_Training("Education costs money.  But then so does ignorance.", AI_Model)
    AI_Training("I have learned over the years that when one's mind is made up, this diminishes fear.", AI_Model)
    AI_Training("It does not matter how slowly you go as long as you do not stop.", AI_Model)
    AI_Training("If you look at what you have in life, you'll always have more. If you look at what you don't have in life, you'll never have enough.", AI_Model)
    AI_Training("Remember that not getting what you want is sometimes a wonderful stroke of luck.", AI_Model)
    AI_Training("You can't use up creativity.  The more you use, the more you have.", AI_Model)
    AI_Training("Dream big and dare to fail.", AI_Model)
    AI_Training("Our lives begin to end the day we become silent about things that matter.", AI_Model)
    AI_Training("Do what you can, where you are, with what you have.", AI_Model)
    AI_Training("If you do what you've always done, you'll get what you've always gotten.", AI_Model)
    AI_Training("Dreaming, after all, is a form of planning.", AI_Model)
    AI_Training("It's your place in the world; it's your life. Go on and do all you can with it, and make it the life you want to live.", AI_Model)
    AI_Training("You may be disappointed if you fail, but you are doomed if you don't try.", AI_Model)
    AI_Training("Remember no one can make you feel inferior without your consent.", AI_Model)
    AI_Training("Life is what we make it, always has been, always will be.", AI_Model)
    AI_Training("The question isn't who is going to let me; it's who is going to stop me.", AI_Model)
    AI_Training("When everything seems to be going against you, remember that the airplane takes off against the wind, not with it.", AI_Model)
    AI_Training("It's not the years in your life that count. It's the life in your years.", AI_Model)
    AI_Training("Change your thoughts and you change your world.", AI_Model)
    AI_Training("Either write something worth reading or do something worth writing.", AI_Model)
    AI_Training("Nothing is impossible, the word itself says, I'm possible!", AI_Model)
    AI_Training("The only way to do great work is to love what you do.", AI_Model)
    AI_Training("If you can dream it, you can achieve it.", AI_Model)

    

    println("${AI_Model.generateAsString()}")
}

fun AI_Training(text: String, graph: Graph<String>) {
    for (sentence: String in text.replace(".", "").replace("!", "").replace("?", "").replace(";", "").replace("-", "").split(",")) {
        var tokens: List<String> = sentence.trim().split(" ").filter(fun (item): Boolean { return !"".equals(item)});
        for (index: Int in tokens.indices) {
            var token = tokens[index].trim().lowercase()
            if (index < tokens.size - 1) {
                var nextToken = tokens[index + 1].trim().lowercase()
                graph.addEdge(token, nextToken)
            }
        }
    }
}

fun sentenceCase(input: String): String {
    if (input.isEmpty()) return input
    return input.substring(0, 1).uppercase() + input.substring(1)
}
