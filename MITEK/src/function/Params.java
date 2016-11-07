/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package function;

/**
 *
 * @author Tommy
 */
public class Params {
    private final String value;
        private final String label;
 
        public Params(String label, String value)
        {
            this.value = value;
            this.label = label;
        }
 
        public String getValue()
        {
            return value;
        }
 
        public String getLabel()
        {
            return label;
        }
 
        @Override
        public String toString()
        {
            return label;
        }
}
