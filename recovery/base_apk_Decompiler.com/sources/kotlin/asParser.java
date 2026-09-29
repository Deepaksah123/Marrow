package kotlin;

import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.C;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.TokenBuffer1;
import kotlin.getDefaultImpl;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public final class asParser implements withTimeZone {
    private static final Pattern AudioAttributesCompatParcelizer = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private float AudioAttributesImplApi21Parcelizer;
    private final AsPropertyTypeDeserializer IconCompatParcelizer;
    private Map<String, TokenBuffer1> MediaBrowserCompatCustomActionResultReceiver;
    private float RemoteActionCompatParcelizer;
    private final boolean read;
    private final _copyBufferContents write;

    private static float write(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    @Override // kotlin.withTimeZone
    public final int IconCompatParcelizer() {
        return 1;
    }

    public asParser() {
        this(null);
    }

    public asParser(List<byte[]> list) {
        this.AudioAttributesImplApi21Parcelizer = -3.4028235E38f;
        this.RemoteActionCompatParcelizer = -3.4028235E38f;
        this.IconCompatParcelizer = new AsPropertyTypeDeserializer();
        if (list != null && !list.isEmpty()) {
            this.read = true;
            String strAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(list.get(0));
            buildTypeSerializer.IconCompatParcelizer(strAudioAttributesCompatParcelizer.startsWith("Format:"));
            this.write = (_copyBufferContents) buildTypeSerializer.IconCompatParcelizer(_copyBufferContents.read(strAudioAttributesCompatParcelizer));
            AudioAttributesCompatParcelizer(new AsPropertyTypeDeserializer(list.get(1)), parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer);
            return;
        }
        this.read = false;
        this.write = null;
    }

    @Override // kotlin.withTimeZone
    public final void RemoteActionCompatParcelizer(byte[] bArr, int i, int i2, withTimeZone.RemoteActionCompatParcelizer remoteActionCompatParcelizer, TypeSerializer<pad3> typeSerializer) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.IconCompatParcelizer.IconCompatParcelizer(bArr, i2 + i);
        this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(i);
        Charset charsetRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.IconCompatParcelizer);
        if (!this.read) {
            AudioAttributesCompatParcelizer(this.IconCompatParcelizer, charsetRemoteActionCompatParcelizer);
        }
        RemoteActionCompatParcelizer(this.IconCompatParcelizer, arrayList, arrayList2, charsetRemoteActionCompatParcelizer);
        ArrayList arrayList3 = (remoteActionCompatParcelizer.IconCompatParcelizer == C.TIME_UNSET || !remoteActionCompatParcelizer.RemoteActionCompatParcelizer) ? null : new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            List<getDefaultImpl> list = arrayList.get(i3);
            if (!list.isEmpty() || i3 == 0) {
                if (i3 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long jLongValue = arrayList2.get(i3).longValue();
                long jLongValue2 = arrayList2.get(i3 + 1).longValue() - arrayList2.get(i3).longValue();
                if (remoteActionCompatParcelizer.IconCompatParcelizer == C.TIME_UNSET || jLongValue >= remoteActionCompatParcelizer.IconCompatParcelizer) {
                    typeSerializer.read(new pad3(list, jLongValue, jLongValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new pad3(list, jLongValue, jLongValue2));
                }
            }
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                typeSerializer.read((pad3) it.next());
            }
        }
    }

    private static Charset RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        Charset charsetOnPrepareFromMediaId = asPropertyTypeDeserializer.onPrepareFromMediaId();
        return charsetOnPrepareFromMediaId != null ? charsetOnPrepareFromMediaId : parseMdtaFromMeta.AudioAttributesImplApi26Parcelizer;
    }

    private void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, Charset charset) {
        while (true) {
            String str = asPropertyTypeDeserializer.read(charset);
            if (str == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(str)) {
                RemoteActionCompatParcelizer(asPropertyTypeDeserializer, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(str)) {
                this.MediaBrowserCompatCustomActionResultReceiver = read(asPropertyTypeDeserializer, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(str)) {
                prune.write("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(str)) {
                return;
            }
        }
    }

    private void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, Charset charset) {
        while (true) {
            String str = asPropertyTypeDeserializer.read(charset);
            if (str == null) {
                return;
            }
            if (asPropertyTypeDeserializer.IconCompatParcelizer() != 0 && asPropertyTypeDeserializer.IconCompatParcelizer(charset) == '[') {
                return;
            }
            String[] strArrSplit = str.split(":");
            if (strArrSplit.length == 2) {
                String str2 = parseMdhd.read(strArrSplit[0].trim());
                str2.hashCode();
                if (str2.equals("playresx")) {
                    this.AudioAttributesImplApi21Parcelizer = Float.parseFloat(strArrSplit[1].trim());
                } else if (str2.equals("playresy")) {
                    try {
                        this.RemoteActionCompatParcelizer = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, TokenBuffer1> read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TokenBuffer1.write writeVarWrite = null;
        while (true) {
            String str = asPropertyTypeDeserializer.read(charset);
            if (str == null || (asPropertyTypeDeserializer.IconCompatParcelizer() != 0 && asPropertyTypeDeserializer.IconCompatParcelizer(charset) == '[')) {
                break;
            }
            if (str.startsWith("Format:")) {
                writeVarWrite = TokenBuffer1.write.write(str);
            } else if (str.startsWith("Style:")) {
                if (writeVarWrite == null) {
                    prune.RemoteActionCompatParcelizer("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(String.valueOf(str)));
                } else {
                    TokenBuffer1 tokenBuffer1Write = TokenBuffer1.write(str, writeVarWrite);
                    if (tokenBuffer1Write != null) {
                        linkedHashMap.put(tokenBuffer1Write.MediaBrowserCompatCustomActionResultReceiver, tokenBuffer1Write);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, List<List<getDefaultImpl>> list, List<Long> list2, Charset charset) {
        _copyBufferContents _copybuffercontents = this.read ? this.write : null;
        while (true) {
            String str = asPropertyTypeDeserializer.read(charset);
            if (str == null) {
                return;
            }
            if (str.startsWith("Format:")) {
                _copybuffercontents = _copyBufferContents.read(str);
            } else if (str.startsWith("Dialogue:")) {
                if (_copybuffercontents == null) {
                    prune.RemoteActionCompatParcelizer("SsaParser", "Skipping dialogue line before complete format: ".concat(String.valueOf(str)));
                } else {
                    RemoteActionCompatParcelizer(str, _copybuffercontents, list, list2);
                }
            }
        }
    }

    private void RemoteActionCompatParcelizer(String str, _copyBufferContents _copybuffercontents, List<List<getDefaultImpl>> list, List<Long> list2) {
        buildTypeSerializer.IconCompatParcelizer(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(",", _copybuffercontents.IconCompatParcelizer);
        if (strArrSplit.length != _copybuffercontents.IconCompatParcelizer) {
            prune.RemoteActionCompatParcelizer("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(String.valueOf(str)));
            return;
        }
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(strArrSplit[_copybuffercontents.RemoteActionCompatParcelizer]);
        if (jAudioAttributesCompatParcelizer == C.TIME_UNSET) {
            prune.RemoteActionCompatParcelizer("SsaParser", "Skipping invalid timing: ".concat(String.valueOf(str)));
            return;
        }
        long jAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(strArrSplit[_copybuffercontents.AudioAttributesCompatParcelizer]);
        if (jAudioAttributesCompatParcelizer2 == C.TIME_UNSET) {
            prune.RemoteActionCompatParcelizer("SsaParser", "Skipping invalid timing: ".concat(String.valueOf(str)));
            return;
        }
        TokenBuffer1 tokenBuffer1 = (this.MediaBrowserCompatCustomActionResultReceiver == null || _copybuffercontents.write == -1) ? null : this.MediaBrowserCompatCustomActionResultReceiver.get(strArrSplit[_copybuffercontents.write].trim());
        String str2 = strArrSplit[_copybuffercontents.read];
        getDefaultImpl getdefaultimplRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(TokenBuffer1.AudioAttributesCompatParcelizer.write(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), tokenBuffer1, TokenBuffer1.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str2), this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer2, list2, list);
        for (int iAudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer, list2, list); iAudioAttributesCompatParcelizer2 < iAudioAttributesCompatParcelizer; iAudioAttributesCompatParcelizer2++) {
            list.get(iAudioAttributesCompatParcelizer2).add(getdefaultimplRemoteActionCompatParcelizer);
        }
    }

    private static long AudioAttributesCompatParcelizer(String str) {
        Matcher matcher = AudioAttributesCompatParcelizer.matcher(str.trim());
        if (!matcher.matches()) {
            return C.TIME_UNSET;
        }
        return (Long.parseLong((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(matcher.group(2))) * 60000000) + (Long.parseLong((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(matcher.group(3))) * 1000000) + (Long.parseLong((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(matcher.group(4))) * 10000);
    }

    private static getDefaultImpl RemoteActionCompatParcelizer(String str, TokenBuffer1 tokenBuffer1, TokenBuffer1.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        getDefaultImpl.write writeVarRemoteActionCompatParcelizer = new getDefaultImpl.write().RemoteActionCompatParcelizer(spannableString);
        if (tokenBuffer1 != null) {
            if (tokenBuffer1.AudioAttributesImplApi26Parcelizer != null) {
                spannableString.setSpan(new ForegroundColorSpan(tokenBuffer1.AudioAttributesImplApi26Parcelizer.intValue()), 0, spannableString.length(), 33);
            }
            if (tokenBuffer1.write == 3 && tokenBuffer1.MediaBrowserCompatItemReceiver != null) {
                spannableString.setSpan(new BackgroundColorSpan(tokenBuffer1.MediaBrowserCompatItemReceiver.intValue()), 0, spannableString.length(), 33);
            }
            if (tokenBuffer1.IconCompatParcelizer != -3.4028235E38f && f2 != -3.4028235E38f) {
                writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(tokenBuffer1.IconCompatParcelizer / f2, 1);
            }
            if (tokenBuffer1.AudioAttributesCompatParcelizer && tokenBuffer1.read) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (tokenBuffer1.AudioAttributesCompatParcelizer) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (tokenBuffer1.read) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (tokenBuffer1.AudioAttributesImplApi21Parcelizer) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (tokenBuffer1.AudioAttributesImplBaseParcelizer) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = -1;
        if (audioAttributesCompatParcelizer.write != -1) {
            i = audioAttributesCompatParcelizer.write;
        } else if (tokenBuffer1 != null) {
            i = tokenBuffer1.RemoteActionCompatParcelizer;
        }
        writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(i)).IconCompatParcelizer(read(i)).read(RemoteActionCompatParcelizer(i));
        if (audioAttributesCompatParcelizer.IconCompatParcelizer != null && f2 != -3.4028235E38f && f != -3.4028235E38f) {
            writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(audioAttributesCompatParcelizer.IconCompatParcelizer.x / f);
            writeVarRemoteActionCompatParcelizer.write(audioAttributesCompatParcelizer.IconCompatParcelizer.y / f2, 0);
        } else {
            writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(write(writeVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()));
            writeVarRemoteActionCompatParcelizer.write(write(writeVarRemoteActionCompatParcelizer.RemoteActionCompatParcelizer()), 0);
        }
        return writeVarRemoteActionCompatParcelizer.write();
    }

    private static Layout.Alignment AudioAttributesCompatParcelizer(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                prune.RemoteActionCompatParcelizer("SsaParser", "Unknown alignment: ".concat(String.valueOf(i)));
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    private static int RemoteActionCompatParcelizer(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                prune.RemoteActionCompatParcelizer("SsaParser", "Unknown alignment: ".concat(String.valueOf(i)));
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int read(int i) {
        switch (i) {
            case -1:
                break;
            case 0:
            default:
                prune.RemoteActionCompatParcelizer("SsaParser", "Unknown alignment: ".concat(String.valueOf(i)));
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int AudioAttributesCompatParcelizer(long j, List<Long> list, List<List<getDefaultImpl>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }
}
