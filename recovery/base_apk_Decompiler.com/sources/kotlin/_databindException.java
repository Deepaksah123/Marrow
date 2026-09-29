package kotlin;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: loaded from: classes2.dex */
public final class _databindException {
    private final RemoteActionCompatParcelizer read;

    public _databindException(TextView textView) {
        StringCollectionDeserializer.write(textView, "textView cannot be null");
        this.read = new write(textView);
    }

    public final InputFilter[] RemoteActionCompatParcelizer(InputFilter[] inputFilterArr) {
        return this.read.write(inputFilterArr);
    }

    public final TransformationMethod RemoteActionCompatParcelizer(TransformationMethod transformationMethod) {
        return this.read.IconCompatParcelizer(transformationMethod);
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.read.AudioAttributesCompatParcelizer(z);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.read.RemoteActionCompatParcelizer(z);
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.read.AudioAttributesCompatParcelizer();
    }

    static class RemoteActionCompatParcelizer {
        void AudioAttributesCompatParcelizer(boolean z) {
        }

        public boolean AudioAttributesCompatParcelizer() {
            return false;
        }

        TransformationMethod IconCompatParcelizer(TransformationMethod transformationMethod) {
            return transformationMethod;
        }

        void RemoteActionCompatParcelizer(boolean z) {
        }

        void read() {
        }

        InputFilter[] write(InputFilter[] inputFilterArr) {
            return inputFilterArr;
        }

        RemoteActionCompatParcelizer() {
        }
    }

    static class write extends RemoteActionCompatParcelizer {
        private final read write;

        write(TextView textView) {
            this.write = new read(textView);
        }

        private boolean IconCompatParcelizer() {
            return !_booleanType.read();
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        void read() {
            if (IconCompatParcelizer()) {
                return;
            }
            this.write.read();
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        InputFilter[] write(InputFilter[] inputFilterArr) {
            return IconCompatParcelizer() ? inputFilterArr : this.write.write(inputFilterArr);
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        TransformationMethod IconCompatParcelizer(TransformationMethod transformationMethod) {
            return IconCompatParcelizer() ? transformationMethod : this.write.IconCompatParcelizer(transformationMethod);
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        void RemoteActionCompatParcelizer(boolean z) {
            if (IconCompatParcelizer()) {
                return;
            }
            this.write.RemoteActionCompatParcelizer(z);
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        void AudioAttributesCompatParcelizer(boolean z) {
            if (IconCompatParcelizer()) {
                this.write.read(z);
            } else {
                this.write.AudioAttributesCompatParcelizer(z);
            }
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        public boolean AudioAttributesCompatParcelizer() {
            return this.write.AudioAttributesCompatParcelizer();
        }
    }

    static class read extends RemoteActionCompatParcelizer {
        private final stdManglePropertyName AudioAttributesCompatParcelizer;
        private boolean RemoteActionCompatParcelizer = true;
        private final TextView read;

        read(TextView textView) {
            this.read = textView;
            this.AudioAttributesCompatParcelizer = new stdManglePropertyName(textView);
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        void read() {
            this.read.setTransformationMethod(IconCompatParcelizer(this.read.getTransformationMethod()));
        }

        private void write() {
            this.read.setFilters(write(this.read.getFilters()));
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        InputFilter[] write(InputFilter[] inputFilterArr) {
            if (!this.RemoteActionCompatParcelizer) {
                return IconCompatParcelizer(inputFilterArr);
            }
            return AudioAttributesCompatParcelizer(inputFilterArr);
        }

        private InputFilter[] AudioAttributesCompatParcelizer(InputFilter[] inputFilterArr) {
            int length = inputFilterArr.length;
            for (InputFilter inputFilter : inputFilterArr) {
                if (inputFilter == this.AudioAttributesCompatParcelizer) {
                    return inputFilterArr;
                }
            }
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
            System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
            inputFilterArr2[length] = this.AudioAttributesCompatParcelizer;
            return inputFilterArr2;
        }

        private InputFilter[] IconCompatParcelizer(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArrayRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(inputFilterArr);
            if (sparseArrayRemoteActionCompatParcelizer.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArrayRemoteActionCompatParcelizer.size()];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                if (sparseArrayRemoteActionCompatParcelizer.indexOfKey(i2) < 0) {
                    inputFilterArr2[i] = inputFilterArr[i2];
                    i++;
                }
            }
            return inputFilterArr2;
        }

        private SparseArray<InputFilter> RemoteActionCompatParcelizer(InputFilter[] inputFilterArr) {
            SparseArray<InputFilter> sparseArray = new SparseArray<>(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof stdManglePropertyName) {
                    sparseArray.put(i, inputFilter);
                }
            }
            return sparseArray;
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        TransformationMethod IconCompatParcelizer(TransformationMethod transformationMethod) {
            if (this.RemoteActionCompatParcelizer) {
                return write(transformationMethod);
            }
            return AudioAttributesCompatParcelizer(transformationMethod);
        }

        private TransformationMethod AudioAttributesCompatParcelizer(TransformationMethod transformationMethod) {
            return transformationMethod instanceof _findSortAlpha ? ((_findSortAlpha) transformationMethod).read() : transformationMethod;
        }

        private TransformationMethod write(TransformationMethod transformationMethod) {
            return ((transformationMethod instanceof _findSortAlpha) || (transformationMethod instanceof PasswordTransformationMethod)) ? transformationMethod : new _findSortAlpha(transformationMethod);
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        void RemoteActionCompatParcelizer(boolean z) {
            if (z) {
                read();
            }
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        void AudioAttributesCompatParcelizer(boolean z) {
            this.RemoteActionCompatParcelizer = z;
            read();
            write();
        }

        @Override // o._databindException.RemoteActionCompatParcelizer
        public boolean AudioAttributesCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        void read(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }
    }
}
