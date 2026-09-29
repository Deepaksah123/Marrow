package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes3.dex */
class zzfx extends zzfy {
    final zzft zzb;
    final Character zzc;

    zzfx(zzft zzftVar, Character ch) {
        this.zzb = zzftVar;
        if (ch != null && zzftVar.zzd('=')) {
            throw new IllegalArgumentException(zzfi.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfx)) {
            return false;
        }
        zzfx zzfxVar = (zzfx) obj;
        if (!this.zzb.equals(zzfxVar.zzb)) {
            return false;
        }
        Character ch = this.zzc;
        Character ch2 = zzfxVar.zzc;
        if (ch != ch2) {
            return ch != null && ch.equals(ch2);
        }
        return true;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return this.zzb.hashCode() ^ (ch == null ? 0 : ch.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sb.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(this.zzc);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    int zza(byte[] bArr, CharSequence charSequence) throws zzfw {
        zzft zzftVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zzb.zzc(charSequenceZze.length())) {
            int length = charSequenceZze.length();
            StringBuilder sb = new StringBuilder("Invalid input length ");
            sb.append(length);
            throw new zzfw(sb.toString());
        }
        int i = 0;
        int i2 = 0;
        while (i < charSequenceZze.length()) {
            long jZzb = 0;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                zzftVar = this.zzb;
                if (i3 >= zzftVar.zzc) {
                    break;
                }
                jZzb <<= zzftVar.zzb;
                if (i + i3 < charSequenceZze.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZze.charAt(i4 + i));
                    i4++;
                }
                i3++;
            }
            int i5 = zzftVar.zzd;
            int i6 = zzftVar.zzb;
            int i7 = (i5 - 1) << 3;
            while (i7 >= (i5 << 3) - (i4 * i6)) {
                bArr[i2] = (byte) ((jZzb >>> i7) & 255);
                i7 -= 8;
                i2++;
            }
            i += this.zzb.zzc;
        }
        return i2;
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        zzff.zzd(0, i2, bArr.length);
        while (i3 < i2) {
            zzf(appendable, bArr, i3, Math.min(this.zzb.zzd, i2 - i3));
            i3 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    final int zzd(int i) {
        zzft zzftVar = this.zzb;
        return zzftVar.zzc * zzga.zza(i, zzftVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    final CharSequence zze(CharSequence charSequence) {
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        while (true) {
            int i = length - 1;
            if (i < 0 || charSequence.charAt(i) != '=') {
                break;
            }
            length = i;
        }
        return charSequence.subSequence(0, length);
    }

    final void zzf(Appendable appendable, byte[] bArr, int i, int i2) throws IOException {
        zzff.zzd(i, i + i2, bArr.length);
        int i3 = 0;
        zzff.zza(i2 <= this.zzb.zzd);
        long j = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            j = (j | ((long) (bArr[i + i4] & 255))) << 8;
        }
        zzft zzftVar = this.zzb;
        while (i3 < (i2 << 3)) {
            int i5 = zzftVar.zzb;
            zzft zzftVar2 = this.zzb;
            appendable.append(zzftVar2.zza(((int) (j >>> ((((i2 + 1) << 3) - i5) - i3))) & zzftVar2.zza));
            i3 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i3 < (this.zzb.zzd << 3)) {
                appendable.append('=');
                i3 += this.zzb.zzb;
            }
        }
    }

    zzfx(String str, String str2, Character ch) {
        this(new zzft(str, str2.toCharArray()), ch);
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    final int zzc(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }
}
