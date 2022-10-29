public class Cards
{

    private static final int capacity = 30;

    //Card names and ID
    private int cardId;
    private String cardName;
    private String cardSuit;

    public Cards(int cardId, String cardName, String cardSuit)
    {
        this.cardId = cardId;
        this.cardName = cardName;
        this.cardSuit = cardSuit;
    }

    public int getCardId(){
    return cardId;
    }

    public void setCardId(int cardId)
    {
        this.cardId = cardId;
    }

    public String getCardName(){
        return  cardName;
    }
    public  void setCardName(String cardName)
    {
        this.cardName = cardName;
    }
    public String getCardSuit()
    {
        return cardSuit;
    }
    public void setCardSuit(String cardSuit) {this.cardSuit =  cardSuit;}
}