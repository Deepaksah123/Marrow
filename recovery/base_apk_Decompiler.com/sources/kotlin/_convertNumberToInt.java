package kotlin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import kotlin.getDefaultImpl;

/* JADX INFO: loaded from: classes2.dex */
final class _convertNumberToInt {
    public final String AudioAttributesCompatParcelizer;
    public final _currentObject AudioAttributesImplApi21Parcelizer;
    public final String AudioAttributesImplApi26Parcelizer;
    private List<_convertNumberToInt> AudioAttributesImplBaseParcelizer;
    public final long IconCompatParcelizer;
    public final String MediaBrowserCompatCustomActionResultReceiver;
    public final long MediaBrowserCompatItemReceiver;
    private final String[] MediaBrowserCompatMediaItem;
    private final HashMap<String, Integer> MediaBrowserCompatSearchResultReceiver;
    private final HashMap<String, Integer> MediaMetadataCompat;
    public final boolean RemoteActionCompatParcelizer;
    public final String read;
    public final _convertNumberToInt write;

    public static _convertNumberToInt read(String str) {
        return new _convertNumberToInt(null, _objectIdIndex.IconCompatParcelizer(str), C.TIME_UNSET, C.TIME_UNSET, null, null, "", null, null);
    }

    public static _convertNumberToInt read(String str, long j, long j2, _currentObject _currentobject, String[] strArr, String str2, String str3, _convertNumberToInt _convertnumbertoint) {
        return new _convertNumberToInt(str, null, j, j2, _currentobject, strArr, str2, str3, _convertnumbertoint);
    }

    private _convertNumberToInt(String str, String str2, long j, long j2, _currentObject _currentobject, String[] strArr, String str3, String str4, _convertNumberToInt _convertnumbertoint) {
        this.AudioAttributesImplApi26Parcelizer = str;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
        this.AudioAttributesCompatParcelizer = str4;
        this.AudioAttributesImplApi21Parcelizer = _currentobject;
        this.MediaBrowserCompatMediaItem = strArr;
        this.RemoteActionCompatParcelizer = str2 != null;
        this.MediaBrowserCompatItemReceiver = j;
        this.IconCompatParcelizer = j2;
        this.read = (String) buildTypeSerializer.IconCompatParcelizer(str3);
        this.write = _convertnumbertoint;
        this.MediaBrowserCompatSearchResultReceiver = new HashMap<>();
        this.MediaMetadataCompat = new HashMap<>();
    }

    private boolean IconCompatParcelizer(long j) {
        long j2 = this.MediaBrowserCompatItemReceiver;
        if (j2 == C.TIME_UNSET && this.IconCompatParcelizer == C.TIME_UNSET) {
            return true;
        }
        if (j2 <= j && this.IconCompatParcelizer == C.TIME_UNSET) {
            return true;
        }
        if (j2 != C.TIME_UNSET || j >= this.IconCompatParcelizer) {
            return j2 <= j && j < this.IconCompatParcelizer;
        }
        return true;
    }

    public final void IconCompatParcelizer(_convertNumberToInt _convertnumbertoint) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new ArrayList();
        }
        this.AudioAttributesImplBaseParcelizer.add(_convertnumbertoint);
    }

    public final _convertNumberToInt IconCompatParcelizer(int i) {
        List<_convertNumberToInt> list = this.AudioAttributesImplBaseParcelizer;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(i);
    }

    public final int IconCompatParcelizer() {
        List<_convertNumberToInt> list = this.AudioAttributesImplBaseParcelizer;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final long[] AudioAttributesCompatParcelizer() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        AudioAttributesCompatParcelizer(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    private void AudioAttributesCompatParcelizer(TreeSet<Long> treeSet, boolean z) {
        boolean zEquals = TtmlNode.TAG_P.equals(this.AudioAttributesImplApi26Parcelizer);
        boolean zEquals2 = TtmlNode.TAG_DIV.equals(this.AudioAttributesImplApi26Parcelizer);
        if (z || zEquals || (zEquals2 && this.AudioAttributesCompatParcelizer != null)) {
            long j = this.MediaBrowserCompatItemReceiver;
            if (j != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.IconCompatParcelizer;
            if (j2 != C.TIME_UNSET) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.AudioAttributesImplBaseParcelizer != null) {
            for (int i = 0; i < this.AudioAttributesImplBaseParcelizer.size(); i++) {
                this.AudioAttributesImplBaseParcelizer.get(i).AudioAttributesCompatParcelizer(treeSet, z || zEquals);
            }
        }
    }

    public final String[] RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final List<getDefaultImpl> write(long j, Map<String, _currentObject> map, Map<String, _checkIsNumber> map2, Map<String, String> map3) {
        List<Pair<String, String>> arrayList = new ArrayList<>();
        write(j, this.read, arrayList);
        TreeMap treeMap = new TreeMap();
        AudioAttributesCompatParcelizer(j, false, this.read, treeMap);
        IconCompatParcelizer(j, map, map2, this.read, treeMap);
        ArrayList arrayList2 = new ArrayList();
        for (Pair<String, String> pair : arrayList) {
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] bArrDecode = Base64.decode(str, 0);
                Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                _checkIsNumber _checkisnumber = (_checkIsNumber) buildTypeSerializer.IconCompatParcelizer(map2.get(pair.first));
                arrayList2.add(new getDefaultImpl.write().read(bitmapDecodeByteArray).RemoteActionCompatParcelizer(_checkisnumber.MediaBrowserCompatItemReceiver).IconCompatParcelizer(0).write(_checkisnumber.RemoteActionCompatParcelizer, 0).read(_checkisnumber.read).read(_checkisnumber.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer(_checkisnumber.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer(_checkisnumber.AudioAttributesImplBaseParcelizer).write());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            _checkIsNumber _checkisnumber2 = (_checkIsNumber) buildTypeSerializer.IconCompatParcelizer(map2.get(entry.getKey()));
            getDefaultImpl.write writeVar = (getDefaultImpl.write) entry.getValue();
            RemoteActionCompatParcelizer((SpannableStringBuilder) buildTypeSerializer.IconCompatParcelizer(writeVar.read()));
            writeVar.write(_checkisnumber2.RemoteActionCompatParcelizer, _checkisnumber2.IconCompatParcelizer);
            writeVar.read(_checkisnumber2.read);
            writeVar.RemoteActionCompatParcelizer(_checkisnumber2.MediaBrowserCompatItemReceiver);
            writeVar.read(_checkisnumber2.AudioAttributesImplApi26Parcelizer);
            writeVar.RemoteActionCompatParcelizer(_checkisnumber2.AudioAttributesImplApi21Parcelizer, _checkisnumber2.MediaBrowserCompatCustomActionResultReceiver);
            writeVar.RemoteActionCompatParcelizer(_checkisnumber2.AudioAttributesImplBaseParcelizer);
            arrayList2.add(writeVar.write());
        }
        return arrayList2;
    }

    private void write(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.read)) {
            str = this.read;
        }
        if (IconCompatParcelizer(j) && TtmlNode.TAG_DIV.equals(this.AudioAttributesImplApi26Parcelizer) && this.AudioAttributesCompatParcelizer != null) {
            list.add(new Pair<>(str, this.AudioAttributesCompatParcelizer));
            return;
        }
        for (int i = 0; i < IconCompatParcelizer(); i++) {
            IconCompatParcelizer(i).write(j, str, list);
        }
    }

    private void AudioAttributesCompatParcelizer(long j, boolean z, String str, Map<String, getDefaultImpl.write> map) {
        this.MediaBrowserCompatSearchResultReceiver.clear();
        this.MediaMetadataCompat.clear();
        if (TtmlNode.TAG_METADATA.equals(this.AudioAttributesImplApi26Parcelizer)) {
            return;
        }
        if (!"".equals(this.read)) {
            str = this.read;
        }
        if (this.RemoteActionCompatParcelizer && z) {
            read(str, map).append((CharSequence) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver));
            return;
        }
        if ("br".equals(this.AudioAttributesImplApi26Parcelizer) && z) {
            read(str, map).append('\n');
            return;
        }
        if (IconCompatParcelizer(j)) {
            for (Map.Entry<String, getDefaultImpl.write> entry : map.entrySet()) {
                this.MediaBrowserCompatSearchResultReceiver.put(entry.getKey(), Integer.valueOf(((CharSequence) buildTypeSerializer.IconCompatParcelizer(entry.getValue().read())).length()));
            }
            boolean zEquals = TtmlNode.TAG_P.equals(this.AudioAttributesImplApi26Parcelizer);
            for (int i = 0; i < IconCompatParcelizer(); i++) {
                IconCompatParcelizer(i).AudioAttributesCompatParcelizer(j, z || zEquals, str, map);
            }
            if (zEquals) {
                _objectIdIndex.IconCompatParcelizer(read(str, map));
            }
            for (Map.Entry<String, getDefaultImpl.write> entry2 : map.entrySet()) {
                this.MediaMetadataCompat.put(entry2.getKey(), Integer.valueOf(((CharSequence) buildTypeSerializer.IconCompatParcelizer(entry2.getValue().read())).length()));
            }
        }
    }

    private static SpannableStringBuilder read(String str, Map<String, getDefaultImpl.write> map) {
        if (!map.containsKey(str)) {
            getDefaultImpl.write writeVar = new getDefaultImpl.write();
            writeVar.RemoteActionCompatParcelizer(new SpannableStringBuilder());
            map.put(str, writeVar);
        }
        return (SpannableStringBuilder) buildTypeSerializer.IconCompatParcelizer(map.get(str).read());
    }

    private void IconCompatParcelizer(long j, Map<String, _currentObject> map, Map<String, _checkIsNumber> map2, String str, Map<String, getDefaultImpl.write> map3) {
        int i;
        if (IconCompatParcelizer(j)) {
            String str2 = !"".equals(this.read) ? this.read : str;
            Iterator<Map.Entry<String, Integer>> it = this.MediaMetadataCompat.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int iIntValue = this.MediaBrowserCompatSearchResultReceiver.containsKey(key) ? this.MediaBrowserCompatSearchResultReceiver.get(key).intValue() : 0;
                int iIntValue2 = next.getValue().intValue();
                if (iIntValue != iIntValue2) {
                    AudioAttributesCompatParcelizer(map, (getDefaultImpl.write) buildTypeSerializer.IconCompatParcelizer(map3.get(key)), iIntValue, iIntValue2, ((_checkIsNumber) buildTypeSerializer.IconCompatParcelizer(map2.get(str2))).AudioAttributesImplBaseParcelizer);
                }
            }
            while (i < IconCompatParcelizer()) {
                IconCompatParcelizer(i).IconCompatParcelizer(j, map, map2, str2, map3);
                i++;
            }
        }
    }

    private void AudioAttributesCompatParcelizer(Map<String, _currentObject> map, getDefaultImpl.write writeVar, int i, int i2, int i3) {
        _currentObject _currentobject = _objectIdIndex.read(this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatMediaItem, map);
        SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) writeVar.read();
        if (spannableStringBuilder == null) {
            spannableStringBuilder = new SpannableStringBuilder();
            writeVar.RemoteActionCompatParcelizer(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
        if (_currentobject != null) {
            _objectIdIndex.IconCompatParcelizer(spannableStringBuilder2, i, i2, _currentobject, this.write, map, i3);
            if (TtmlNode.TAG_P.equals(this.AudioAttributesImplApi26Parcelizer)) {
                if (_currentobject.MediaBrowserCompatItemReceiver() != Float.MAX_VALUE) {
                    writeVar.IconCompatParcelizer((_currentobject.MediaBrowserCompatItemReceiver() * (-90.0f)) / 100.0f);
                }
                if (_currentobject.MediaDescriptionCompat() != null) {
                    writeVar.AudioAttributesCompatParcelizer(_currentobject.MediaDescriptionCompat());
                }
                if (_currentobject.AudioAttributesImplApi26Parcelizer() != null) {
                    writeVar.write(_currentobject.AudioAttributesImplApi26Parcelizer());
                }
            }
        }
    }

    private static void RemoteActionCompatParcelizer(SpannableStringBuilder spannableStringBuilder) {
        for (_smallerThanInt _smallerthanint : (_smallerThanInt[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), _smallerThanInt.class)) {
            spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(_smallerthanint), spannableStringBuilder.getSpanEnd(_smallerthanint), "");
        }
        for (int i = 0; i < spannableStringBuilder.length(); i++) {
            if (spannableStringBuilder.charAt(i) == ' ') {
                int i2 = i + 1;
                int i3 = i2;
                while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                    i3++;
                }
                int i4 = i3 - i2;
                if (i4 > 0) {
                    spannableStringBuilder.delete(i, i4 + i);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
            spannableStringBuilder.delete(0, 1);
        }
        for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
            if (spannableStringBuilder.charAt(i5) == '\n') {
                int i6 = i5 + 1;
                if (spannableStringBuilder.charAt(i6) == ' ') {
                    spannableStringBuilder.delete(i6, i5 + 2);
                }
            }
        }
        if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
            spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
        }
        for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
            if (spannableStringBuilder.charAt(i7) == ' ') {
                int i8 = i7 + 1;
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    spannableStringBuilder.delete(i7, i8);
                }
            }
        }
        if (spannableStringBuilder.length() <= 0 || spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) != '\n') {
            return;
        }
        spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
    }
}
