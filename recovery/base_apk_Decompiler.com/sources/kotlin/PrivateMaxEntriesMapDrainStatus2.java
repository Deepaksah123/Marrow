package kotlin;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.PrivateMaxEntriesMapDrainStatus2;

/* JADX INFO: loaded from: classes4.dex */
public final class PrivateMaxEntriesMapDrainStatus2 {
    private static final Pattern write = Pattern.compile("(&#13;)?&#10;");

    public static read IconCompatParcelizer(CharSequence charSequence, float f) {
        byte b = 0;
        if (charSequence == null) {
            return new read("", onMoovContainerAtomRead.AudioAttributesCompatParcelizer(), b);
        }
        if (!(charSequence instanceof Spanned)) {
            return new read(IconCompatParcelizer(charSequence), onMoovContainerAtomRead.AudioAttributesCompatParcelizer(), b);
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet hashSet = new HashSet();
        for (BackgroundColorSpan backgroundColorSpan : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColorSpan.getBackgroundColor()));
        }
        HashMap map = new HashMap();
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            map.put(PrivateMaxEntriesMap.read("bg_".concat(String.valueOf(iIntValue))), LaissezFaireSubTypeValidator.read("background-color:%s;", PrivateMaxEntriesMap.AudioAttributesCompatParcelizer(iIntValue)));
        }
        SparseArray<write> sparseArray = read(spanned, f);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i = 0;
        int i2 = 0;
        while (i < sparseArray.size()) {
            int iKeyAt = sparseArray.keyAt(i);
            sb.append(IconCompatParcelizer(spanned.subSequence(i2, iKeyAt)));
            write writeVar = sparseArray.get(iKeyAt);
            Collections.sort(writeVar.RemoteActionCompatParcelizer, RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer);
            Iterator it2 = writeVar.RemoteActionCompatParcelizer.iterator();
            while (it2.hasNext()) {
                sb.append(((RemoteActionCompatParcelizer) it2.next()).read);
            }
            Collections.sort(writeVar.IconCompatParcelizer, RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver);
            Iterator it3 = writeVar.IconCompatParcelizer.iterator();
            while (it3.hasNext()) {
                sb.append(((RemoteActionCompatParcelizer) it3.next()).write);
            }
            i++;
            i2 = iKeyAt;
        }
        sb.append(IconCompatParcelizer(spanned.subSequence(i2, spanned.length())));
        return new read(sb.toString(), map, b);
    }

    private static SparseArray<write> read(Spanned spanned, float f) {
        SparseArray<write> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String strWrite = write(obj, f);
            String str = read(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (strWrite != null) {
                RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(spanStart, spanEnd, strWrite, str, (byte) 0);
                AudioAttributesCompatParcelizer(sparseArray, spanStart).IconCompatParcelizer.add(remoteActionCompatParcelizer);
                AudioAttributesCompatParcelizer(sparseArray, spanEnd).RemoteActionCompatParcelizer.add(remoteActionCompatParcelizer);
            }
        }
        return sparseArray;
    }

    private static String write(Object obj, float f) {
        float size;
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return LaissezFaireSubTypeValidator.read("<span style='color:%s;'>", PrivateMaxEntriesMap.AudioAttributesCompatParcelizer(((ForegroundColorSpan) obj).getForegroundColor()));
        }
        if (obj instanceof BackgroundColorSpan) {
            return LaissezFaireSubTypeValidator.read("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        }
        if (obj instanceof TypeDeserializer1) {
            return "<span style='text-combine-upright:all;'>";
        }
        if (obj instanceof AbsoluteSizeSpan) {
            AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
            if (absoluteSizeSpan.getDip()) {
                size = absoluteSizeSpan.getSize();
            } else {
                size = absoluteSizeSpan.getSize() / f;
            }
            return LaissezFaireSubTypeValidator.read("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
        }
        if (obj instanceof RelativeSizeSpan) {
            return LaissezFaireSubTypeValidator.read("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
        }
        if (obj instanceof TypefaceSpan) {
            String family = ((TypefaceSpan) obj).getFamily();
            if (family != null) {
                return LaissezFaireSubTypeValidator.read("<span style='font-family:\"%s\";'>", family);
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "<b>";
            }
            if (style == 2) {
                return "<i>";
            }
            if (style != 3) {
                return null;
            }
            return "<b><i>";
        }
        if (obj instanceof getDescForKnownTypeIds) {
            int i = ((getDescForKnownTypeIds) obj).IconCompatParcelizer;
            if (i == -1) {
                return "<ruby style='ruby-position:unset;'>";
            }
            if (i == 1) {
                return "<ruby style='ruby-position:over;'>";
            }
            if (i != 2) {
                return null;
            }
            return "<ruby style='ruby-position:under;'>";
        }
        if (obj instanceof UnderlineSpan) {
            return "<u>";
        }
        if (!(obj instanceof typeFromId)) {
            return null;
        }
        typeFromId typefromid = (typeFromId) obj;
        return LaissezFaireSubTypeValidator.read("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", IconCompatParcelizer(typefromid.IconCompatParcelizer, typefromid.write), IconCompatParcelizer(typefromid.read));
    }

    private static String read(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof TypeDeserializer1) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof typeFromId)) {
            return "</span>";
        }
        if (obj instanceof TypefaceSpan) {
            if (((TypefaceSpan) obj).getFamily() != null) {
                return "</span>";
            }
            return null;
        }
        if (obj instanceof StyleSpan) {
            int style = ((StyleSpan) obj).getStyle();
            if (style == 1) {
                return "</b>";
            }
            if (style == 2) {
                return "</i>";
            }
            if (style == 3) {
                return "</i></b>";
            }
        } else {
            if (obj instanceof getDescForKnownTypeIds) {
                StringBuilder sb = new StringBuilder("<rt>");
                sb.append(IconCompatParcelizer(((getDescForKnownTypeIds) obj).AudioAttributesCompatParcelizer));
                sb.append("</rt></ruby>");
                return sb.toString();
            }
            if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
        }
        return null;
    }

    private static String IconCompatParcelizer(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        if (i2 == 1) {
            sb.append("filled ");
        } else if (i2 == 2) {
            sb.append("open ");
        }
        if (i == 0) {
            sb.append("none");
        } else if (i == 1) {
            sb.append(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
        } else if (i == 2) {
            sb.append(TtmlNode.TEXT_EMPHASIS_MARK_DOT);
        } else if (i == 3) {
            sb.append(TtmlNode.TEXT_EMPHASIS_MARK_SESAME);
        } else {
            sb.append("unset");
        }
        return sb.toString();
    }

    private static String IconCompatParcelizer(int i) {
        if (i == 2) {
            return "under left";
        }
        return "over right";
    }

    private static write AudioAttributesCompatParcelizer(SparseArray<write> sparseArray, int i) {
        write writeVar = sparseArray.get(i);
        if (writeVar != null) {
            return writeVar;
        }
        write writeVar2 = new write();
        sparseArray.put(i, writeVar2);
        return writeVar2;
    }

    private static String IconCompatParcelizer(CharSequence charSequence) {
        return write.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    public static class read {
        public final String RemoteActionCompatParcelizer;
        public final Map<String, String> write;

        /* synthetic */ read(String str, Map map, byte b) {
            this(str, map);
        }

        private read(String str, Map<String, String> map) {
            this.RemoteActionCompatParcelizer = str;
            this.write = map;
        }
    }

    static final class RemoteActionCompatParcelizer {
        public final int IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final String read;
        public final String write;
        private static final Comparator<RemoteActionCompatParcelizer> MediaBrowserCompatItemReceiver = new Comparator() { // from class: o.PrivateMaxEntriesMapEntryIterator
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PrivateMaxEntriesMapDrainStatus2.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((PrivateMaxEntriesMapDrainStatus2.RemoteActionCompatParcelizer) obj, (PrivateMaxEntriesMapDrainStatus2.RemoteActionCompatParcelizer) obj2);
            }
        };
        private static final Comparator<RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer = new Comparator() { // from class: o.PrivateMaxEntriesMapDrainStatus3
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return PrivateMaxEntriesMapDrainStatus2.RemoteActionCompatParcelizer.read((PrivateMaxEntriesMapDrainStatus2.RemoteActionCompatParcelizer) obj, (PrivateMaxEntriesMapDrainStatus2.RemoteActionCompatParcelizer) obj2);
            }
        };

        /* synthetic */ RemoteActionCompatParcelizer(int i, int i2, String str, String str2, byte b) {
            this(i, i2, str, str2);
        }

        static /* synthetic */ int RemoteActionCompatParcelizer(RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
            int iCompare = Integer.compare(remoteActionCompatParcelizer2.IconCompatParcelizer, remoteActionCompatParcelizer.IconCompatParcelizer);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = remoteActionCompatParcelizer.write.compareTo(remoteActionCompatParcelizer2.write);
            return iCompareTo != 0 ? iCompareTo : remoteActionCompatParcelizer.read.compareTo(remoteActionCompatParcelizer2.read);
        }

        static /* synthetic */ int read(RemoteActionCompatParcelizer remoteActionCompatParcelizer, RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
            int iCompare = Integer.compare(remoteActionCompatParcelizer2.RemoteActionCompatParcelizer, remoteActionCompatParcelizer.RemoteActionCompatParcelizer);
            if (iCompare != 0) {
                return iCompare;
            }
            int iCompareTo = remoteActionCompatParcelizer2.write.compareTo(remoteActionCompatParcelizer.write);
            return iCompareTo != 0 ? iCompareTo : remoteActionCompatParcelizer2.read.compareTo(remoteActionCompatParcelizer.read);
        }

        private RemoteActionCompatParcelizer(int i, int i2, String str, String str2) {
            this.RemoteActionCompatParcelizer = i;
            this.IconCompatParcelizer = i2;
            this.write = str;
            this.read = str2;
        }
    }

    static final class write {
        private final List<RemoteActionCompatParcelizer> IconCompatParcelizer = new ArrayList();
        private final List<RemoteActionCompatParcelizer> RemoteActionCompatParcelizer = new ArrayList();
    }
}
