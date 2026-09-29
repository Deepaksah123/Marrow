###### Class androidx.constraintlayout.widget.Barrier (androidx.constraintlayout.widget.Barrier)
.class public Landroidx/constraintlayout/widget/Barrier;
.super Landroidx/constraintlayout/widget/ConstraintHelper;
.source "SourceFile"


# instance fields
.field private AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

.field private AudioAttributesImplBaseParcelizer:I

.field private MediaBrowserCompatCustomActionResultReceiver:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 118
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;)V

    const/16 p1, 0x8

    .line 119
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .registers 3

    .line 123
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/16 p1, 0x8

    .line 124
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setVisibility(I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .registers 4

    .line 128
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintHelper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/16 p1, 0x8

    .line 129
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->setVisibility(I)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/JdkDeserializers;IZ)V
    .registers 7

    .line 151
    iput p2, p0, Landroidx/constraintlayout/widget/Barrier;->MediaBrowserCompatCustomActionResultReceiver:I

    const/4 p2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x6

    const/4 v2, 0x5

    if-eqz p3, :cond_14

    .line 163
    iget p3, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplBaseParcelizer:I

    if-ne p3, v2, :cond_f

    .line 164
    iput p2, p0, Landroidx/constraintlayout/widget/Barrier;->MediaBrowserCompatCustomActionResultReceiver:I

    goto :goto_1f

    :cond_f
    if-ne p3, v1, :cond_1f

    .line 166
    iput v0, p0, Landroidx/constraintlayout/widget/Barrier;->MediaBrowserCompatCustomActionResultReceiver:I

    goto :goto_1f

    .line 169
    :cond_14
    iget p3, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplBaseParcelizer:I

    if-ne p3, v2, :cond_1b

    .line 170
    iput v0, p0, Landroidx/constraintlayout/widget/Barrier;->MediaBrowserCompatCustomActionResultReceiver:I

    goto :goto_1f

    :cond_1b
    if-ne p3, v1, :cond_1f

    .line 172
    iput p2, p0, Landroidx/constraintlayout/widget/Barrier;->MediaBrowserCompatCustomActionResultReceiver:I

    .line 176
    :cond_1f
    :goto_1f
    instance-of p2, p1, Lo/_deSerializeBCP47Locale;

    if-eqz p2, :cond_2a

    .line 177
    check-cast p1, Lo/_deSerializeBCP47Locale;

    .line 178
    iget p0, p0, Landroidx/constraintlayout/widget/Barrier;->MediaBrowserCompatCustomActionResultReceiver:I

    invoke-virtual {p1, p0}, Lo/_deSerializeBCP47Locale;->AudioAttributesCompatParcelizer(I)V

    :cond_2a
    return-void
.end method


# virtual methods
.method protected final AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V
    .registers 8

    .line 193
    invoke-super {p0, p1}, Landroidx/constraintlayout/widget/ConstraintHelper;->AudioAttributesCompatParcelizer(Landroid/util/AttributeSet;)V

    .line 194
    new-instance v0, Lo/_deSerializeBCP47Locale;

    invoke-direct {v0}, Lo/_deSerializeBCP47Locale;-><init>()V

    iput-object v0, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    if-eqz p1, :cond_50

    .line 196
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lo/_isBlank$read;->ConstraintLayout_Layout:[I

    invoke-virtual {v0, p1, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    .line 197
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v0

    const/4 v1, 0x0

    move v2, v1

    :goto_1c
    if-ge v2, v0, :cond_4d

    .line 199
    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    .line 200
    sget v4, Lo/_isBlank$read;->ConstraintLayout_Layout_barrierDirection:I

    if-ne v3, v4, :cond_2e

    .line 201
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    invoke-virtual {p0, v3}, Landroidx/constraintlayout/widget/Barrier;->setType(I)V

    goto :goto_4a

    .line 202
    :cond_2e
    sget v4, Lo/_isBlank$read;->ConstraintLayout_Layout_barrierAllowsGoneWidgets:I

    if-ne v3, v4, :cond_3d

    .line 203
    iget-object v4, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    const/4 v5, 0x1

    invoke-virtual {p1, v3, v5}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    invoke-virtual {v4, v3}, Lo/_deSerializeBCP47Locale;->write(Z)V

    goto :goto_4a

    .line 204
    :cond_3d
    sget v4, Lo/_isBlank$read;->ConstraintLayout_Layout_barrierMargin:I

    if-ne v3, v4, :cond_4a

    .line 205
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v3

    .line 206
    iget-object v4, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    invoke-virtual {v4, v3}, Lo/_deSerializeBCP47Locale;->read(I)V

    :cond_4a
    :goto_4a
    add-int/lit8 v2, v2, 0x1

    goto :goto_1c

    .line 209
    :cond_4d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 211
    :cond_50
    iget-object p1, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    iput-object p1, p0, Landroidx/constraintlayout/widget/ConstraintHelper;->RemoteActionCompatParcelizer:Lo/JsonNodeDeserializer;

    .line 212
    invoke-virtual {p0}, Landroidx/constraintlayout/widget/ConstraintHelper;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public final IconCompatParcelizer()I
    .registers 1

    .line 138
    iget p0, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplBaseParcelizer:I

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Z
    .registers 1

    .line 239
    iget-object p0, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    invoke-virtual {p0}, Lo/_deSerializeBCP47Locale;->AudioAttributesCompatParcelizer()Z

    move-result p0

    return p0
.end method

.method public final read()I
    .registers 1

    .line 259
    iget-object p0, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    invoke-virtual {p0}, Lo/_deSerializeBCP47Locale;->RemoteActionCompatParcelizer()I

    move-result p0

    return p0
.end method

.method public final read(Lo/JdkDeserializers;Z)V
    .registers 4

    .line 184
    iget v0, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplBaseParcelizer:I

    invoke-direct {p0, p1, v0, p2}, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesCompatParcelizer(Lo/JdkDeserializers;IZ)V

    return-void
.end method

.method public final read(Lo/ReferenceTypeDeserializer$write;Lo/JsonNodeDeserializerArrayDeserializer;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/ReferenceTypeDeserializer$write;",
            "Lo/JsonNodeDeserializerArrayDeserializer;",
            "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;",
            "Landroid/util/SparseArray<",
            "Lo/JdkDeserializers;",
            ">;)V"
        }
    .end annotation

    .line 273
    invoke-super {p0, p1, p2, p3, p4}, Landroidx/constraintlayout/widget/ConstraintHelper;->read(Lo/ReferenceTypeDeserializer$write;Lo/JsonNodeDeserializerArrayDeserializer;Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;Landroid/util/SparseArray;)V

    .line 274
    instance-of p3, p2, Lo/_deSerializeBCP47Locale;

    if-eqz p3, :cond_29

    .line 275
    move-object p3, p2

    check-cast p3, Lo/_deSerializeBCP47Locale;

    .line 276
    invoke-virtual {p2}, Lo/JdkDeserializers;->onPrepareFromMediaId()Lo/JdkDeserializers;

    move-result-object p2

    check-cast p2, Lo/_long;

    .line 277
    invoke-virtual {p2}, Lo/_long;->_init_lambda5()Z

    move-result p2

    .line 278
    iget-object p4, p1, Lo/ReferenceTypeDeserializer$write;->write:Lo/ReferenceTypeDeserializer$IconCompatParcelizer;

    iget p4, p4, Lo/ReferenceTypeDeserializer$IconCompatParcelizer;->onStop:I

    invoke-direct {p0, p3, p4, p2}, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesCompatParcelizer(Lo/JdkDeserializers;IZ)V

    .line 279
    iget-object p0, p1, Lo/ReferenceTypeDeserializer$write;->write:Lo/ReferenceTypeDeserializer$IconCompatParcelizer;

    iget-boolean p0, p0, Lo/ReferenceTypeDeserializer$IconCompatParcelizer;->onSkipToNext:Z

    invoke-virtual {p3, p0}, Lo/_deSerializeBCP47Locale;->write(Z)V

    .line 280
    iget-object p0, p1, Lo/ReferenceTypeDeserializer$write;->write:Lo/ReferenceTypeDeserializer$IconCompatParcelizer;

    iget p0, p0, Lo/ReferenceTypeDeserializer$IconCompatParcelizer;->onSkipToPrevious:I

    invoke-virtual {p3, p0}, Lo/_deSerializeBCP47Locale;->read(I)V

    :cond_29
    return-void
.end method

.method public setAllowsGoneWidget(Z)V
    .registers 2

    .line 216
    iget-object p0, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    invoke-virtual {p0, p1}, Lo/_deSerializeBCP47Locale;->write(Z)V

    return-void
.end method

.method public setDpMargin(I)V
    .registers 3

    .line 248
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    int-to-float p1, p1

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    .line 250
    iget-object p0, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    invoke-virtual {p0, p1}, Lo/_deSerializeBCP47Locale;->read(I)V

    return-void
.end method

.method public setMargin(I)V
    .registers 2

    .line 268
    iget-object p0, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplApi21Parcelizer:Lo/_deSerializeBCP47Locale;

    invoke-virtual {p0, p1}, Lo/_deSerializeBCP47Locale;->read(I)V

    return-void
.end method

.method public setType(I)V
    .registers 2

    .line 147
    iput p1, p0, Landroidx/constraintlayout/widget/Barrier;->AudioAttributesImplBaseParcelizer:I

    return-void
.end method
