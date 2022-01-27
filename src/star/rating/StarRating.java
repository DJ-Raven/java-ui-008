package star.rating;

import java.awt.Color;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

public class StarRating extends javax.swing.JPanel {

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
        if (star == 1) {
            star1ActionPerformed(null);
        } else if (star == 2) {
            star2ActionPerformed(null);
        } else if (star == 3) {
            star3ActionPerformed(null);
        } else if (star == 4) {
            star4ActionPerformed(null);
        } else {
            star5ActionPerformed(null);
        }
    }

    private List<EventStarRating> events = new ArrayList<>();
    private int star;

    public StarRating() {
        initComponents();
        init();
    }

    private void init() {
        setOpaque(false);
        setBackground(new Color(204, 204, 204));
        setForeground(new Color(238, 236, 0));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        star1 = new star.rating.Star();
        star2 = new star.rating.Star();
        star3 = new star.rating.Star();
        star4 = new star.rating.Star();
        star5 = new star.rating.Star();

        setLayout(new java.awt.GridLayout(1, 5));

        star1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star1ActionPerformed(evt);
            }
        });
        add(star1);

        star2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star2ActionPerformed(evt);
            }
        });
        add(star2);

        star3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star3ActionPerformed(evt);
            }
        });
        add(star3);

        star4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star4ActionPerformed(evt);
            }
        });
        add(star4);

        star5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                star5ActionPerformed(evt);
            }
        });
        add(star5);
    }// </editor-fold>//GEN-END:initComponents

    private void star1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star1ActionPerformed
        star1.setSelected(true);
        star2.setSelected(false);
        star3.setSelected(false);
        star4.setSelected(false);
        star5.setSelected(false);
        star = 1;
        runEvent();
    }//GEN-LAST:event_star1ActionPerformed

    private void star2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star2ActionPerformed
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(false);
        star4.setSelected(false);
        star5.setSelected(false);
        star = 2;
        runEvent();
    }//GEN-LAST:event_star2ActionPerformed

    private void star3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star3ActionPerformed
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(false);
        star5.setSelected(false);
        star = 3;
        runEvent();
    }//GEN-LAST:event_star3ActionPerformed

    private void star4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star4ActionPerformed
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(true);
        star5.setSelected(false);
        star = 4;
        runEvent();
    }//GEN-LAST:event_star4ActionPerformed

    private void star5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_star5ActionPerformed
        star1.setSelected(true);
        star2.setSelected(true);
        star3.setSelected(true);
        star4.setSelected(true);
        star5.setSelected(true);
        star = 5;
        runEvent();
    }//GEN-LAST:event_star5ActionPerformed

    @Override
    public void setBackground(Color color) {
        super.setBackground(color);
        for (Component com : getComponents()) {
            com.setBackground(color);
        }
    }

    @Override
    public void setForeground(Color color) {
        super.setForeground(color);
        for (Component com : getComponents()) {
            com.setForeground(color);
        }
    }

    public void addEventStarRating(EventStarRating event) {
        events.add(event);
    }

    private void runEvent() {
        for (EventStarRating event : events) {
            event.selected(star);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private star.rating.Star star1;
    private star.rating.Star star2;
    private star.rating.Star star3;
    private star.rating.Star star4;
    private star.rating.Star star5;
    // End of variables declaration//GEN-END:variables
}
