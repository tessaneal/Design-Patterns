package adapter;

import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

/**
 * Allows a LittleBook to be changed into a Book format for the Library
 * @author Tessa Neal
 */
public class MediaAdapter implements Media{
    
    private LittleMedia littleMedia;

    /**
     * Constructs an instance of a media adapter
     * @param littleMedia Media at the library that has condensed information
     */
    public MediaAdapter(LittleMedia littleMedia) {
        this.littleMedia = littleMedia;
    }

    /**
     * Returns the title of the little media
     * @return A String representation of the title of the little media
     */
    public String getTitle() {
        return littleMedia.getTitle();
    }

    /**
     * Returns the author of the little media
     * @return An Author representing the author of the little media
     */
    public Author getAuthor() {
        String delim = " ";
        String[] authorName = littleMedia.getAuthor().split(delim);
        return new Author(authorName[0], authorName[1]);
    }

    /**
     * Returns the description of the little media
     * @return A String representation of the title of the little media
     */
    public String getDescription() {
        return littleMedia.getDescription();
    }

    /**
     * Adds a Review to the little media utilizing a reviewer's first name, last name, date, rating, and comment
     * @param firstName A String representing the first name of the reviewer
     * @param lastName A String representing the last name of the reviewer
     * @param date A Date representing the date the review was posted
     * @param rating A double representing the rating that the reviewer gave
     * @param comment A String represneting the comment that the reviewer gave
     */
    public void addReview(String firstName, String lastName, Date date, double rating, String comment) {
        String userName = firstName + " " + lastName;
        littleMedia.addReview(userName, date, (int)Math.round(rating), comment);
    }

    /**
     * Returns the reviews for the little media
     * @return An ArrayList of Reviews representing the reviews for the little media
     */
    public ArrayList<Review> getReviews() {
        ArrayList<Review> reviews = new ArrayList<Review>();
        
        for(int i=0; i < littleMedia.getReviews().size(); i++) {
            String delim = " ";
            String[] review = littleMedia.getReviews().get(i).split(delim);
            double rating =Double.parseDouble(review[0]);
            int indexStart = 3;
            int indexEnd = review.length - 1;
            String simpleDate = review[indexEnd];
            SimpleDateFormat dateFormatter = new SimpleDateFormat("MM/dd/yyyy");
            Date date = parseDate(simpleDate);
            indexEnd -= 2;
            String lastName = review[indexEnd];
            indexEnd--;
            String firstName = review[indexEnd];
            indexEnd--;
            String comment = "";
            for(int j=indexStart; j < indexEnd; j++) {
                comment += review[j];
                if(j != (indexEnd-1)) {
                    comment += " ";
                }
            }
            reviews.add(new Review(firstName, lastName, date, rating, comment));
        }

        return reviews;
    }

    /**
     * Changes a short form date into a Date object
     * @param date A string representing the short form date
     * @return A Date that reflects the short form date
     */
    public static Date parseDate(String date) {
        try {
            return new SimpleDateFormat("MM/dd/yyyy").parse(date);
        } catch (ParseException e) {
            return null;
        }
    }
}
