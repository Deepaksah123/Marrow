package kotlin;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class DefaultAnalyticsCollectorExternalSyntheticLambda0 {
    DefaultAnalyticsCollectorExternalSyntheticLambda0() {
    }

    static List<String> AudioAttributesCompatParcelizer(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda0.class)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(DefaultAnalyticsCollectorExternalSyntheticLambda17.AudioAttributesImplBaseParcelizer(view));
            Object tag = view.getTag();
            if (tag != null) {
                arrayList.add(tag.toString());
            }
            CharSequence contentDescription = view.getContentDescription();
            if (contentDescription != null) {
                arrayList.add(contentDescription.toString());
            }
            try {
                if (view.getId() != -1) {
                    String[] strArrSplit = view.getResources().getResourceName(view.getId()).split("/");
                    if (strArrSplit.length == 2) {
                        arrayList.add(strArrSplit[1]);
                    }
                }
            } catch (Resources.NotFoundException unused) {
            }
            ArrayList arrayList2 = new ArrayList();
            for (String str : arrayList) {
                if (!str.isEmpty() && str.length() <= 100) {
                    arrayList2.add(str.toLowerCase());
                }
            }
            return arrayList2;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda0.class);
            return null;
        }
    }

    static List<String> read(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda0.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            ViewGroup viewGroupAudioAttributesImplApi26Parcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda17.AudioAttributesImplApi26Parcelizer(view);
            if (viewGroupAudioAttributesImplApi26Parcelizer != null) {
                for (View view2 : DefaultAnalyticsCollectorExternalSyntheticLambda17.IconCompatParcelizer(viewGroupAudioAttributesImplApi26Parcelizer)) {
                    if (view != view2) {
                        arrayList.addAll(IconCompatParcelizer(view2));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda0.class);
            return null;
        }
    }

    static boolean IconCompatParcelizer(List<String> list, List<String> list2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda0.class)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (IconCompatParcelizer(it.next(), list2)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda0.class);
            return false;
        }
    }

    private static boolean IconCompatParcelizer(String str, List<String> list) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda0.class)) {
            return false;
        }
        try {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda0.class);
            return false;
        }
    }

    static boolean AudioAttributesCompatParcelizer(String str, String str2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda0.class)) {
            return false;
        }
        try {
            return str.matches(str2);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda0.class);
            return false;
        }
    }

    private static List<String> IconCompatParcelizer(View view) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda0.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if (!(view instanceof EditText)) {
                if (view instanceof TextView) {
                    String string = ((TextView) view).getText().toString();
                    if (!string.isEmpty() && string.length() < 100) {
                        arrayList.add(string.toLowerCase());
                        return arrayList;
                    }
                } else {
                    Iterator<View> it = DefaultAnalyticsCollectorExternalSyntheticLambda17.IconCompatParcelizer(view).iterator();
                    while (it.hasNext()) {
                        arrayList.addAll(IconCompatParcelizer(it.next()));
                    }
                }
            }
            return arrayList;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda0.class);
            return null;
        }
    }
}
