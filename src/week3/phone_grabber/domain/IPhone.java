package week3.phone_grabber.domain;

import java.util.List;

/**
 * Created by ivan on 28.05.16.
 */
public interface IPhone {

    public List<Phone> find (String name);

    public Phone grab (String url);


}
