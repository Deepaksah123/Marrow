package kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeTriggerPendingMessages {
    public static final maybeTriggerPendingMessages read = new maybeTriggerPendingMessages("COMPOSITION");
    private final List<String> IconCompatParcelizer;
    private maybeUpdateReadingPeriod write;

    public maybeTriggerPendingMessages(String... strArr) {
        this.IconCompatParcelizer = Arrays.asList(strArr);
    }

    private maybeTriggerPendingMessages(maybeTriggerPendingMessages maybetriggerpendingmessages) {
        this.IconCompatParcelizer = new ArrayList(maybetriggerpendingmessages.IconCompatParcelizer);
        this.write = maybetriggerpendingmessages.write;
    }

    public final maybeTriggerPendingMessages write(String str) {
        maybeTriggerPendingMessages maybetriggerpendingmessages = new maybeTriggerPendingMessages(this);
        maybetriggerpendingmessages.IconCompatParcelizer.add(str);
        return maybetriggerpendingmessages;
    }

    public final maybeTriggerPendingMessages IconCompatParcelizer(maybeUpdateReadingPeriod maybeupdatereadingperiod) {
        maybeTriggerPendingMessages maybetriggerpendingmessages = new maybeTriggerPendingMessages(this);
        maybetriggerpendingmessages.write = maybeupdatereadingperiod;
        return maybetriggerpendingmessages;
    }

    public final maybeUpdateReadingPeriod read() {
        return this.write;
    }

    public final boolean read(String str, int i) {
        if (IconCompatParcelizer(str)) {
            return true;
        }
        if (i >= this.IconCompatParcelizer.size()) {
            return false;
        }
        return this.IconCompatParcelizer.get(i).equals(str) || this.IconCompatParcelizer.get(i).equals("**") || this.IconCompatParcelizer.get(i).equals("*");
    }

    public final int RemoteActionCompatParcelizer(String str, int i) {
        if (IconCompatParcelizer(str)) {
            return 0;
        }
        if (this.IconCompatParcelizer.get(i).equals("**")) {
            return (i != this.IconCompatParcelizer.size() - 1 && this.IconCompatParcelizer.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean IconCompatParcelizer(String str, int i) {
        if (i >= this.IconCompatParcelizer.size()) {
            return false;
        }
        boolean z = i == this.IconCompatParcelizer.size() - 1;
        String str2 = this.IconCompatParcelizer.get(i);
        if (!str2.equals("**")) {
            return (z || (i == this.IconCompatParcelizer.size() + (-2) && IconCompatParcelizer())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z && this.IconCompatParcelizer.get(i + 1).equals(str)) {
            return i == this.IconCompatParcelizer.size() + (-2) || (i == this.IconCompatParcelizer.size() + (-3) && IconCompatParcelizer());
        }
        if (z) {
            return true;
        }
        int i2 = i + 1;
        if (i2 < this.IconCompatParcelizer.size() - 1) {
            return false;
        }
        return this.IconCompatParcelizer.get(i2).equals(str);
    }

    public final boolean AudioAttributesCompatParcelizer(String str, int i) {
        return "__container".equals(str) || i < this.IconCompatParcelizer.size() - 1 || this.IconCompatParcelizer.get(i).equals("**");
    }

    private static boolean IconCompatParcelizer(String str) {
        return "__container".equals(str);
    }

    private boolean IconCompatParcelizer() {
        return this.IconCompatParcelizer.get(r1.size() - 1).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            maybeTriggerPendingMessages maybetriggerpendingmessages = (maybeTriggerPendingMessages) obj;
            if (!this.IconCompatParcelizer.equals(maybetriggerpendingmessages.IconCompatParcelizer)) {
                return false;
            }
            maybeUpdateReadingPeriod maybeupdatereadingperiod = this.write;
            if (maybeupdatereadingperiod != null) {
                return maybeupdatereadingperiod.equals(maybetriggerpendingmessages.write);
            }
            if (maybetriggerpendingmessages.write == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        maybeUpdateReadingPeriod maybeupdatereadingperiod = this.write;
        return (iHashCode * 31) + (maybeupdatereadingperiod != null ? maybeupdatereadingperiod.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.IconCompatParcelizer);
        sb.append(",resolved=");
        sb.append(this.write != null);
        sb.append('}');
        return sb.toString();
    }
}
