package com.company;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        try {
            explore();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void explore() {
        // Your amazing code below...
        String[] commonWords = { "with","many", "is","fully","from","have","by","who","what","when",
                "which", "has", "are", "their", "on", "been", "to", "the", "and", "of","a", "an",
                "this", "generally", "recently", "that","in", "as","be", "for","1","it","these","3","2","not",
                "or","also", "because", "s","through","2","3","4", "into","some", "there", "can", "how", "its",
                "however", "was","about","such","but","being","they", "thus","them","itself","among","only",
                "should", "may"};
        ArrayList<String> cWords = new ArrayList<String>();

        List<String> cword = Stream.of(commonWords).collect(Collectors.toList());


        String text = "Authentic leadership\n" +
                "From Wikipedia, the free encyclopedia\n" +
                "\n" +
                "\n" +
                "Jump to navigation\n" +
                "Jump to search\n" +
                "Authentic leadership is an approach to leadership that emphasizes building the leader's legitimacy through honest relationships with followers which value their input and are built on an ethical foundation. Generally, authentic leaders are positive people with truthful self-concepts who promote openness. By building trust and generating enthusiastic support from their subordinates, authentic leaders are able to improve individual and team performance. This approach has been fully embraced by many leaders and leadership coaches who view authentic leadership as an alternative to leaders who emphasize profit and share price over people and ethics. Authentic leadership is a growing area of study in academic research on leadership which has recently grown from obscurity to the beginnings of a fully mature concept.[1] \n" +
                "Despite the popularity of the construct, many foundational papers on this topic have recently been retracted or called into question because of issues surrounding the reporting of data and the inability of the authors to produce their original data.[2][3] Moreover, there have been some recent high-profile criticisms of the theoretical basis of the construct,[4][5] which has been said to be build on \"shaky philosophical and theoretical foundations, tautological reasoning, weak empirical studies, nonsensical measurement tools, unsupported knowledge claims and a generally simplistic and out of date view of corporate life\".[6] \n" +
                "\n" +
                "Contents\n" +
                "1\n" +
                "Historical Background\n" +
                "2\n" +
                "Definitions\n" +
                "2.1\n" +
                "Authenticity and ethics\n" +
                "2.2\n" +
                "Patterns of behavior\n" +
                "3\n" +
                "Empirical model of authentic leadership\n" +
                "3.1\n" +
                "Antecedents\n" +
                "3.2\n" +
                "Mediators\n" +
                "3.3\n" +
                "Consequences\n" +
                "4\n" +
                "Measures\n" +
                "4.1\n" +
                "Leader Authenticity Scale (LAS)\n" +
                "4.2\n" +
                "Authentic Leadership Questionnaire (ALQ)\n" +
                "4.3\n" +
                "Authentic Leadership Inventory (ALI)\n" +
                "4.4\n" +
                "Authenticity Inventory (AL:3)\n" +
                "5\n" +
                "Becoming an authentic leader\n" +
                "6\n" +
                "Relationship to other leadership theories\n" +
                "7\n" +
                "Future research\n" +
                "8\n" +
                "Further reading\n" +
                "9\n" +
                "See also\n" +
                "10\n" +
                "References\n" +
                "11\n" +
                "External links\n" +
                "Historical Background[edit]\n" +
                "The concept of authenticity can trace its history back to ancient Greece. Ancient Greek philosophers stressed authenticity as an important state through an emphasis on being in control of one's own life and the ubiquitous admonition: Know thyself.[7][8] Authentic leadership as we know it today evolved from the history of these terms. It originated in the 1960s as a means to describe how an organization reflects itself authentically through leadership.[1] Some believed that an entire organization could act authentically like a single person through responsibility, reactions to uncertainty, and creativity.[9] Others believed that authentic leadership is actually more about how the leaders define their own role within an organization.[10] \n" +
                "Recently, authentic leadership has garnered more attention among scholars and practitioners because of publications from Harvard professor and former Medtronic CEO Bill George [11][12] and other calls for research.[13] The past decade has seen a surge in publications about authentic leadership, producing new models, definitions, and theories. The emphasis on conceptual development suggest that the concept is still in the initial stages of construct evolution, though as the scholarly research on the topic progresses, the types of publications produced appear to be shifting from mostly conceptual pieces to more and more empirically based articles. This shift may be indicative of a nascent emergence of the construct from an introduction and elaboration evolutionary stage to one marked by evaluation and augmentation.[1] \n" +
                "Definitions[edit]\n" +
                "Because the concept itself is not yet fully mature in a theoretical sense, there are many different definitions of authentic leadership, each with its own nuances. However, consensus appears to be growing that authentic leadership includes these distinct qualities: \n" +
                "Self-awareness: An ongoing process of reflection and re-examination by the leader of his or her own strength, weaknesses, and values; a leader who is aware of their core beliefs is unlikely to stray from them.\n" +
                "Relational Transparency: Open sharing by the leader of his or her own thoughts and beliefs, balanced by a minimization of inappropriate emotions\n" +
                "Balanced Processing: Solicitation by the leader of opposing viewpoints and fair-minded consideration of those viewpoints\n" +
                "Internalized Moral Perspective: A positive ethical foundation adhered to by the leader in his or her relationships and decisions that is resistant to outside pressures\n" +
                "There is empirical research that supports a superordinate construct of authentic leadership that includes these four components.[14] It should be noted, however, that this evidence has been called into question[15] as a result of reporting statistically impossible results. Other papers by the same authors have been retracted for similar problems and the inability of the authors to produce evidence of their claims.[16][17][18] \n" +
                "Authenticity and ethics[edit]\n" +
                "Some have suggested authentic leadership need not include a moral component. Proponents of this point of view emphasize the word authentic in authentic leadership and suggest that one can be true to a corrupt value system and still be an authentic leader. Faking a set of ethical constraints to which a leader does not personally prescribe would be a sign of inauthenticity.[19] Others reject the idea that a leader can truly exhibit the other components of the construct – self-awareness, relational transparency, and balanced processing – without the moral maturity associated with a positive personal value system.[20] \n" +
                "Authenticity could be seen as a precondition for ethical leadership. The 2019 study indicates that social work leaders’ authenticity positively influences their dispositions toward ethical decision-making.[21] \n" +
                "Patterns of behavior[edit]\n" +
                "Authentic leadership should be understood as a pattern of behaviors through which leaders exhibit the components of authentic leadership. Thus, it is insufficient for the leader to be self-aware, etc. without also conducting him or herself in such a way that others, particularly subordinates, view the leader as authentic. \n" +
                "Empirical model of authentic leadership[edit]\n" +
                "Although the concept of authentic leadership as an actionable model is relatively new to leadership theory and practice, there has been some initial research regarding the overall effectiveness of the model as well as the inner workings of the model within teams and organizations. This research has been used to explain what precedes the appearance of authentic leadership behaviors, what makes authentic leadership effective, and the consequences of adopting an authentic leadership style. These factors contribute to why authentic leadership works within teams and organizations. \n" +
                "Antecedents[edit]\n" +
                "Several leader characteristics may be important to the appearance of authentic leadership behaviors by leaders. For instance, both leader self-knowledge and self-consistency have been shown to act as antecedents for authentic leadership (the former being a static process of understanding one's own strengths and weaknesses and the latter consistency between their values, beliefs, and actions). This relates to the key components of authentic leadership: leaders first have to be clear about their values and convictions to be perceived as authentic by their followers and they have to demonstrate consistency between their values, beliefs, and actions.[22] \n" +
                "Additional research suggests that leaders who act in accordance to the three components of positive psychological capital (PsyCap) (hope, optimism, and resiliency) are more likely to become authentic leaders.[23] This is true for several reasons. First, leaders who can set and explain goals effectively create a more hopeful environment for their followers. Second, optimistic leaders have a greater ability to motivate their followers and help them more easily anticipate future events. Third, resilient leaders are better equipped to function in changing environments in order to support their followers.[23] \n" +
                "High and low degrees of self-monitoring in an individual has also been suggested as an antecedent of authentic leadership. Self-monitoring reflect how likely someone is to actively construct a public image that aligns with the expectations of others.[24] It has been proposed that low self-monitoring leads to a higher degree of authentic leadership characteristics because low self-monitors and authentic leaders both act in a way that is consistent with what they believe and value. However, empirical research has not supported this theory thus far.[25] \n" +
                "Mediators[edit]\n" +
                "Among the proponents of authentic leadership, there are many theories regarding why authentic leadership is an effective leadership strategy. \n" +
                "Authentic leadership has been shown to promote team members’ belief in the team's ability to succeed, known as team potency,[26] which has in turn been shown to improve team performance.[27][28] This occurs because authentic leadership behaviors promote team virtuousness which, in turn, promotes team potency and performance.[26] \n" +
                "Authentic leadership has also been shown to encourage team performance by promoting trust in the group or organization, because follower trust in the leader will encourage increased loyalty to the organization, increasing performance as a result.[29] \n" +
                "Other research has shown that the relationship between authentic leadership and both organizational citizenship behavior and empowerment is mediated by identification with supervisors. This is because a follower's interpersonal identification with his or her leader links leader and follower outcomes (in this case, empowerment and OCBs).[30] It should be noted, however, that the article that these claims are based on was retracted amid concerns that the results were not reported accurately and the authors could not produce evidence to verify their claims.[31][16] \n" +
                "Research into the mechanisms of authentic leadership is ongoing, but it is becoming clear that authentic leaders engender an emotional and/or psychological response from their followers that leads to an increase in individual and team performance. \n" +
                "Consequences[edit]\n" +
                "Initial research has shown that leaders who practice authentic leadership normally lead teams that perform better than teams with leaders who do not practice authentic leadership.[26][29][32] This is not necessarily surprising as the model itself arises from successful leaders who simply described what they did and put the label authentic leadership on that description. The academic model that has been developed over the years since the publishing of True North[12] has largely resulted from the work of academics to further describe the model so that it can be researched and duplicated. \n" +
                "Measures[edit]\n" +
                "Both research scientists and practitioners have an interest in measuring the level of authentic leadership exhibited by individual leaders. Scientists such as industrial-organizational psychologists and management researchers measure levels of authentic leadership as a way to study the interaction of authentic leaders with their organization. Practitioners such as management consultants and human resource professionals measure levels of authentic leadership to help assess leader behaviors within an organization. \n" +
                "Leader Authenticity Scale (LAS)[edit]\n" +
                "The first significant measure specifically gauging levels of authentic leadership was the 32-item Leader Authenticity Scale (LAS). The LAS measures the leader's tendency to behave genuinely regardless of formal job titles (referred to as salience of self over role), to acknowledge accountability for mistakes, and to avoid manipulation of subordinates. The LAS was developed by education researchers who identified leader authenticity as an important indicator of organizational climate in schools.[33] Later researchers questioned the reliability and generalizability of the LAS due to the small and non-diverse sample used in its development.[1] \n" +
                "Authentic Leadership Questionnaire (ALQ)[edit]\n" +
                "The Authentic Leadership Questionnaire (ALQ) is a survey completed by followers to capture the level of authentic leadership behaviors exhibited by supervisors. A self-assessment version is also available. The measure, developed specifically with the emerging authentic leadership theory in mind, includes sixteen items grouped into four major subcategories: self-awareness, relational transparency, internalized moral perspective, and balanced processing.[14] Most academic research since the development of the ALQ has used it to measure levels of authentic leadership.[1] However, the ALQ has been criticized for using a qualitative (and therefore subjective) approach to validation rather than a quantitative approach. Additionally, the ALQ is a commercially copyrighted measure (only sample measures are freely available), potentially limiting its availability to scientists and practitioners.[34] \n" +
                "Recently, the validity of the claims made in the validation paper for this article have been called into question owing to the reporting of statistically impossible results.[15] These allegations follow a list of retractions of similar work by the authors of this article.[16][17][18] \n" +
                "Authentic Leadership Inventory (ALI)[edit]\n" +
                "The Authentic Leadership Inventory (ALI), developed in 2011, is a survey completed by followers to capture the level of authentic leadership behaviors exhibited by supervisors. Building on the theoretical research used to develop the ALQ, the ALI provides a more rigorously developed and tested measure of authentic leadership. In addition, the entire 16 item inventory is freely available.[34] \n" +
                "Authenticity Inventory (AL:3)[edit]\n" +
                "An additional measure related to authentic leadership, the Authenticity Inventory (AL:3), is used to measure individual authenticity.[8][35] Though not a leadership measure per se, it is used by some as a measure of the authenticity of a leader.[1] \n" +
                "Becoming an authentic leader[edit]\n" +
                "The basis of authentic leadership comes from the leader's personal history, including life-events (often called trigger events) that direct the flow of leadership formation.[20] How leaders interpret these personal histories and trigger events will inform their self-identity as leaders and influence their moral development and values, two essential components in the development of authentic leaders.[36] Because authenticity in leadership is rooted in being true to one's own ideals of leadership and ethical values, authentic leadership is brought about through a lifetime of experiences and is resistant to traditional training programs. Development of authentic leaders involves guided self-reflection, building self-awareness through the use of a life-stories approach. An authentic leader who is aware of their core beliefs is unlikely to stray from them. There is now emerging evidence that group-coaching is an effective approach to Authentic Leadership Development.[37][38][39] It may also be facilitated by the intervention of developmental trigger events coupled with directed self-reflection.[36] Recognizing leadership contingency theory, which suggest that leaders must adapt their styles and behaviors to be effective across different situations, some leadership development theorists have pointed out that only the most expert of leaders can incorporate the needs of varying situations and different or diverse followers into their own underlying value system so as to remain authentic while also being effective across diverse leadership contexts.[40] \n" +
                "Relationship to other leadership theories[edit]\n" +
                "The end of the twentieth century saw a rise of new theories of leadership that attempt to understand how leaders not only direct and manage, but also inspire their followers in unique ways. The construct of charismatic leadership was introduced in Max Weber in the 1920s but greatly expanded upon by leadership theorists beginning in the 1970s and continuing to today.[41] Charismatic leadership theories attempt to capture the attributes and behaviors of extraordinary leaders in extraordinary situations (including variances of either dimension) in order to understand unusual or unique responses of followers.[42] A short time later, transformational leadership theory was developed extensively. This theory differentiated transformational leadership behaviors from transactional leadership behaviors; transformational leaders inspire extraordinary action by providing insight to followers regarding the importance of their work and its outcomes, by calling on followers to subordinate their self-interest to that of the organization, and by motivating followers through activation of higher-order needs.[41] More recent examples of what have been called neo-charismatic leadership theories include servant leadership, ethical leadership, spiritual leadership, and visionary leadership. \n" +
                "Authentic leadership proponents and scholars suggest that authentic leadership is conceptually distinct from these other approaches to leadership. There is empirical support for this position, as studies have shown that authentic leadership can explain variance in leadership performance over and above that explained by other leadership theories, such as transformational leadership and ethical leadership.[14] At the same time, some theorists have suggested that authentic leadership is but one (albeit important) aspect of other forms of leadership.[43] This ambiguous understanding of what distinguishes authentic leadership theory from other leadership theories may be considered a signal that, despite growing research into authentic leadership, the theory remains at the beginning stages of construct development; more research will be required to draw distinctions among these various leadership theories.[1] Many of these theories are also underdeveloped; thus the differentiation problem cannot be strictly attributed to authentic leadership theory development.[44] \n" +
                "Future research[edit]";
        Map<String, Long> wordMap = filterWordsByCount(removeCommonWords(getWordCount(text),cword),10);

        prettyPrint(wordMap);

    }

    private static void prettyPrint(Map<String, Long> wordMap) {
        wordMap.entrySet().stream()
                .sorted((entry2, entry)-> entry.getValue().compareTo(entry2.getValue()))
                .forEach(entry->System.out.printf("%s = %s%n", entry.getKey(), entry.getValue()));
    }


    private static Map<String, Long> getWordCount(String text){
        Map<String, Long> result = Stream.of(text.split("\\W+"))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(
                        word -> word, Collectors.counting()
                ));
    /*Long resultCount = Stream.of(result.values())
            .filter(entries -> entries. < 1)
            .count();*/
        return result;
    }
    private static Map<String, Long> removeCommonWords(Map<String,Long> wordMap, List<String> commonWords){
        Map<String, Long> filteredWordMap = wordMap.entrySet().stream().filter(entry->!commonWords.contains(entry.getKey()))
                .collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));

        return filteredWordMap;
    }
    private static Map<String, Long> filterWordsByCount(Map<String, Long> wordCount, int reductionValue){
        Map<String, Long> filteredWordCount = wordCount.entrySet().stream().filter(e->e.getValue()>reductionValue)
                .collect(Collectors.toMap(entry->entry.getKey(), entry->entry.getValue()));
        return filteredWordCount;
    }
}
