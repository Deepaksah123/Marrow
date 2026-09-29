###### Class com.fasterxml.jackson.databind.deser.SettableBeanProperty (com.fasterxml.jackson.databind.deser.SettableBeanProperty)
.class public abstract Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
.super Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;
    }
.end annotation


# static fields
.field protected static final MISSING_VALUE_DESERIALIZER:Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field protected final transient _contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

.field protected _managedReferenceName:Ljava/lang/String;

.field public final _nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

.field public _objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

.field protected final _propName:Lcom/fasterxml/jackson/databind/PropertyName;

.field protected _propertyIndex:I

.field public final _type:Lcom/fasterxml/jackson/databind/JavaType;

.field public final _valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public final _valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

.field protected _viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

.field protected final _wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 36
    new-instance v0, Lcom/fasterxml/jackson/databind/deser/impl/FailingDeserializer;

    const-string v1, "No _valueDeserializer assigned"

    invoke-direct {v0, v1}, Lcom/fasterxml/jackson/databind/deser/impl/FailingDeserializer;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->MISSING_VALUE_DESERIALIZER:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/PropertyName;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/PropertyMetadata;Lcom/fasterxml/jackson/databind/JsonDeserializer;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/PropertyName;",
            "Lcom/fasterxml/jackson/databind/JavaType;",
            "Lcom/fasterxml/jackson/databind/PropertyMetadata;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 177
    invoke-direct {p0, p3}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;-><init>(Lcom/fasterxml/jackson/databind/PropertyMetadata;)V

    const/4 p3, -0x1

    .line 125
    iput p3, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    if-nez p1, :cond_d

    .line 180
    sget-object p1, Lcom/fasterxml/jackson/databind/PropertyName;->NO_NAME:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    goto :goto_13

    .line 182
    :cond_d
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/PropertyName;->internSimpleName()Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 184
    :goto_13
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    const/4 p1, 0x0

    .line 185
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 186
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

    .line 187
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    .line 188
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 189
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 191
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    return-void
.end method

.method protected constructor <init>(Lcom/fasterxml/jackson/databind/PropertyName;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/PropertyName;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/PropertyMetadata;)V
    .registers 7

    .line 144
    invoke-direct {p0, p6}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;-><init>(Lcom/fasterxml/jackson/databind/PropertyMetadata;)V

    const/4 p6, -0x1

    .line 125
    iput p6, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    if-nez p1, :cond_d

    .line 151
    sget-object p1, Lcom/fasterxml/jackson/databind/PropertyName;->NO_NAME:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    goto :goto_13

    .line 153
    :cond_d
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/PropertyName;->internSimpleName()Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 155
    :goto_13
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 156
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 157
    iput-object p5, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

    const/4 p1, 0x0

    .line 158
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    if-eqz p4, :cond_22

    .line 162
    invoke-virtual {p4, p0}, Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;->forProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    move-result-object p4

    .line 164
    :cond_22
    iput-object p4, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 165
    sget-object p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->MISSING_VALUE_DESERIALIZER:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 166
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)V
    .registers 3

    .line 199
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;-><init>(Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;)V

    const/4 v0, -0x1

    .line 125
    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    .line 200
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 201
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 202
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 203
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

    .line 204
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 205
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 206
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_managedReferenceName:Ljava/lang/String;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_managedReferenceName:Ljava/lang/String;

    .line 207
    iget v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    .line 208
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    .line 209
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    .line 210
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/JsonDeserializer;Lcom/fasterxml/jackson/databind/deser/NullValueProvider;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;",
            "Lcom/fasterxml/jackson/databind/deser/NullValueProvider;",
            ")V"
        }
    .end annotation

    .line 220
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;-><init>(Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;)V

    const/4 v0, -0x1

    .line 125
    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    .line 221
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 222
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 223
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 224
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

    .line 225
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 226
    iget-object v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_managedReferenceName:Ljava/lang/String;

    iput-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_managedReferenceName:Ljava/lang/String;

    .line 227
    iget v0, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    if-nez p2, :cond_29

    .line 230
    sget-object p2, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->MISSING_VALUE_DESERIALIZER:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    goto :goto_2b

    .line 232
    :cond_29
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 234
    :goto_2b
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    .line 235
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    .line 237
    sget-object p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->MISSING_VALUE_DESERIALIZER:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-ne p3, p1, :cond_39

    .line 238
    iget-object p3, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 240
    :cond_39
    iput-object p3, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;Lcom/fasterxml/jackson/databind/PropertyName;)V
    .registers 4

    .line 248
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;-><init>(Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;)V

    const/4 v0, -0x1

    .line 125
    iput v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    .line 249
    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 250
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    .line 251
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_wrapperName:Lcom/fasterxml/jackson/databind/PropertyName;

    .line 252
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_contextAnnotations:Lcom/fasterxml/jackson/databind/util/Annotations;

    .line 253
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 254
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    .line 255
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_managedReferenceName:Ljava/lang/String;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_managedReferenceName:Ljava/lang/String;

    .line 256
    iget p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    iput p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    .line 257
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    .line 258
    iget-object p2, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    iput-object p2, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    .line 259
    iget-object p1, p1, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;)V
    .registers 12

    .line 136
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->getFullName()Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object v1

    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->getWrapperName()Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object v3

    .line 137
    invoke-virtual {p1}, Lcom/fasterxml/jackson/databind/introspect/BeanPropertyDefinition;->getMetadata()Lcom/fasterxml/jackson/databind/PropertyMetadata;

    move-result-object v6

    move-object v0, p0

    move-object v2, p2

    move-object v4, p3

    move-object v5, p4

    .line 136
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;-><init>(Lcom/fasterxml/jackson/databind/PropertyName;Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/PropertyName;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;Lcom/fasterxml/jackson/databind/util/Annotations;Lcom/fasterxml/jackson/databind/PropertyMetadata;)V

    return-void
.end method


# virtual methods
.method protected _throwAsIOE(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Exception;)Ljava/io/IOException;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 626
    invoke-static {p2}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->throwIfIOE(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 627
    invoke-static {p2}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->throwIfRTE(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 629
    invoke-static {p2}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->getRootCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    move-result-object p0

    .line 630
    invoke-static {p0}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->exceptionMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2, p0}, Lcom/fasterxml/jackson/databind/JsonMappingException;->from(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/fasterxml/jackson/databind/JsonMappingException;

    move-result-object p0

    throw p0
.end method

.method protected _throwAsIOE(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Exception;Ljava/lang/Object;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 601
    instance-of v0, p2, Ljava/lang/IllegalArgumentException;

    if-eqz v0, :cond_4c

    .line 602
    invoke-static {p3}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->classNameOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    .line 603
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Problem deserializing property \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 604
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 605
    const-string v1, "\' (expected type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 606
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getType()Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 607
    const-string p0, "; actual type: "

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 609
    invoke-static {p2}, Lcom/fasterxml/jackson/databind/util/ClassUtil;->exceptionMessage(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_3e

    .line 611
    const-string p3, ", problem: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_43

    .line 614
    :cond_3e
    const-string p0, " (no error message provided)"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 616
    :goto_43
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0, p2}, Lcom/fasterxml/jackson/databind/JsonMappingException;->from(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/String;Ljava/lang/Throwable;)Lcom/fasterxml/jackson/databind/JsonMappingException;

    move-result-object p0

    throw p0

    .line 618
    :cond_4c
    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_throwAsIOE(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Exception;)Ljava/io/IOException;

    return-void
.end method

.method protected _throwAsIOE(Ljava/lang/Exception;Ljava/lang/Object;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    .line 641
    invoke-virtual {p0, v0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_throwAsIOE(Lcom/fasterxml/jackson/core/JsonParser;Ljava/lang/Exception;Ljava/lang/Object;)V

    return-void
.end method

.method public assignIndex(I)V
    .registers 5

    .line 320
    iget v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_8

    .line 323
    iput p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    return-void

    .line 321
    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Property \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\' already had index ("

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propertyIndex:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "), trying to assign "

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public depositSchemaProperty(Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;Lcom/fasterxml/jackson/databind/SerializerProvider;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/fasterxml/jackson/databind/JsonMappingException;
        }
    .end annotation

    .line 387
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/ConcreteBeanPropertyBase;->isRequired()Z

    move-result p2

    if-eqz p2, :cond_a

    .line 388
    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;->property(Lcom/fasterxml/jackson/databind/BeanProperty;)V

    return-void

    .line 390
    :cond_a
    invoke-interface {p1, p0}, Lcom/fasterxml/jackson/databind/jsonFormatVisitors/JsonObjectFormatVisitor;->optionalProperty(Lcom/fasterxml/jackson/databind/BeanProperty;)V

    return-void
.end method

.method public final deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 538
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v0

    if-eqz v0, :cond_f

    .line 539
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    invoke-interface {p0, p2}, Lcom/fasterxml/jackson/databind/deser/NullValueProvider;->getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 541
    :cond_f
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    if-eqz v0, :cond_1a

    .line 542
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    invoke-virtual {p0, p1, p2, v0}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserializeWithType(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 545
    :cond_1a
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    invoke-virtual {v0, p1, p2}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_29

    .line 547
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    invoke-interface {p0, p2}, Lcom/fasterxml/jackson/databind/deser/NullValueProvider;->getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_29
    return-object p1
.end method

.method public abstract deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract deserializeSetAndReturn(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public final deserializeWith(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 560
    sget-object v0, Lcom/fasterxml/jackson/core/JsonToken;->VALUE_NULL:Lcom/fasterxml/jackson/core/JsonToken;

    invoke-virtual {p1, v0}, Lcom/fasterxml/jackson/core/JsonParser;->hasToken(Lcom/fasterxml/jackson/core/JsonToken;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 562
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/impl/NullsConstantProvider;->isSkipper(Lcom/fasterxml/jackson/databind/deser/NullValueProvider;)Z

    move-result p1

    if-nez p1, :cond_40

    .line 565
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    invoke-interface {p0, p2}, Lcom/fasterxml/jackson/databind/deser/NullValueProvider;->getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 567
    :cond_17
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    if-eqz v0, :cond_30

    .line 574
    invoke-virtual {p2}, Lcom/fasterxml/jackson/databind/DatabindContext;->getTypeFactory()Lcom/fasterxml/jackson/databind/type/TypeFactory;

    move-result-object v0

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/fasterxml/jackson/databind/type/TypeFactory;->constructType(Ljava/lang/reflect/Type;)Lcom/fasterxml/jackson/databind/JavaType;

    move-result-object v0

    .line 575
    invoke-virtual {p2, v0, p0}, Lcom/fasterxml/jackson/databind/DeserializationContext;->findContextualValueDeserializer(Lcom/fasterxml/jackson/databind/JavaType;Lcom/fasterxml/jackson/databind/BeanProperty;)Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    .line 576
    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    .line 579
    :cond_30
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    invoke-virtual {v0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/JsonDeserializer;->deserialize(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_48

    .line 581
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    invoke-static {p1}, Lcom/fasterxml/jackson/databind/deser/impl/NullsConstantProvider;->isSkipper(Lcom/fasterxml/jackson/databind/deser/NullValueProvider;)Z

    move-result p1

    if-eqz p1, :cond_41

    :cond_40
    return-object p3

    .line 584
    :cond_41
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    invoke-interface {p0, p2}, Lcom/fasterxml/jackson/databind/deser/NullValueProvider;->getNullValue(Lcom/fasterxml/jackson/databind/DeserializationContext;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_48
    return-object p1
.end method

.method public fixAccess(Lcom/fasterxml/jackson/databind/DeserializationConfig;)V
    .registers 2

    return-void
.end method

.method public getCreatorIndex()I
    .registers 3

    .line 454
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    .line 452
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Internal error: no creator index for property \'%s\' (of type %s)"

    invoke-static {v1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected getDeclaringClass()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 401
    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getMember()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object p0

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public getFullName()Lcom/fasterxml/jackson/databind/PropertyName;
    .registers 1

    .line 360
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    return-object p0
.end method

.method public getInjectableValueId()Ljava/lang/Object;
    .registers 1

    const/4 p0, 0x0

    return-object p0
.end method

.method public getManagedReferenceName()Ljava/lang/String;
    .registers 1

    .line 404
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_managedReferenceName:Ljava/lang/String;

    return-object p0
.end method

.method public abstract getMember()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
.end method

.method public final getName()Ljava/lang/String;
    .registers 1

    .line 355
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/PropertyName;->getSimpleName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getNullValueProvider()Lcom/fasterxml/jackson/databind/deser/NullValueProvider;
    .registers 1

    .line 427
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_nullProvider:Lcom/fasterxml/jackson/databind/deser/NullValueProvider;

    return-object p0
.end method

.method public getObjectIdInfo()Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;
    .registers 1

    .line 406
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    return-object p0
.end method

.method public getType()Lcom/fasterxml/jackson/databind/JavaType;
    .registers 1

    .line 364
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_type:Lcom/fasterxml/jackson/databind/JavaType;

    return-object p0
.end method

.method public getValueDeserializer()Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 415
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    .line 416
    sget-object v0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->MISSING_VALUE_DESERIALIZER:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-ne p0, v0, :cond_7

    const/4 p0, 0x0

    :cond_7
    return-object p0
.end method

.method public getValueTypeDeserializer()Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;
    .registers 1

    .line 422
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    return-object p0
.end method

.method public hasValueDeserializer()Z
    .registers 2

    .line 409
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueDeserializer:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-eqz p0, :cond_a

    sget-object v0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->MISSING_VALUE_DESERIALIZER:Lcom/fasterxml/jackson/databind/JsonDeserializer;

    if-eq p0, v0, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

.method public hasValueTypeDeserializer()Z
    .registers 1

    .line 412
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_valueTypeDeserializer:Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public hasViews()Z
    .registers 1

    .line 433
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    if-eqz p0, :cond_6

    const/4 p0, 0x1

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method

.method public isIgnorable()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public isInjectionOnly()Z
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public markAsIgnorable()V
    .registers 1

    return-void
.end method

.method public abstract set(Ljava/lang/Object;Ljava/lang/Object;)V
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public abstract setAndReturn(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation
.end method

.method public setManagedReferenceName(Ljava/lang/String;)V
    .registers 2

    .line 301
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_managedReferenceName:Ljava/lang/String;

    return-void
.end method

.method public setObjectIdInfo(Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;)V
    .registers 2

    .line 305
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_objectIdInfo:Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    return-void
.end method

.method public setViews([Ljava/lang/Class;)V
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    if-nez p1, :cond_6

    const/4 p1, 0x0

    .line 310
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    return-void

    .line 312
    :cond_6
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/util/ViewMatcher;->construct([Ljava/lang/Class;)Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    move-result-object p1

    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .registers 3

    .line 644
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[property \'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "\']"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public visibleInView(Ljava/lang/Class;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 430
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_viewMatcher:Lcom/fasterxml/jackson/databind/util/ViewMatcher;

    if-eqz p0, :cond_c

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/util/ViewMatcher;->isVisibleForView(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_c

    const/4 p0, 0x0

    return p0

    :cond_c
    const/4 p0, 0x1

    return p0
.end method

.method public abstract withName(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
.end method

.method public abstract withNullProvider(Lcom/fasterxml/jackson/databind/deser/NullValueProvider;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
.end method

.method public withSimpleName(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .registers 3

    .line 290
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    if-nez v0, :cond_a

    new-instance v0, Lcom/fasterxml/jackson/databind/PropertyName;

    invoke-direct {v0, p1}, Lcom/fasterxml/jackson/databind/PropertyName;-><init>(Ljava/lang/String;)V

    goto :goto_e

    .line 291
    :cond_a
    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/PropertyName;->withSimpleName(Ljava/lang/String;)Lcom/fasterxml/jackson/databind/PropertyName;

    move-result-object v0

    .line 292
    :goto_e
    iget-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->_propName:Lcom/fasterxml/jackson/databind/PropertyName;

    if-ne v0, p1, :cond_13

    return-object p0

    :cond_13
    invoke-virtual {p0, v0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->withName(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object p0

    return-object p0
.end method

.method public abstract withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;"
        }
    .end annotation
.end method

###### Class com.fasterxml.jackson.databind.deser.SettableBeanProperty.Delegating (com.fasterxml.jackson.databind.deser.SettableBeanProperty$Delegating)
.class public abstract Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;
.super Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Delegating"
.end annotation


# instance fields
.field public final delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)V
    .registers 2

    .line 668
    invoke-direct {p0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;-><init>(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)V

    .line 669
    iput-object p1, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    return-void
.end method


# virtual methods
.method protected _with(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .registers 3

    .line 679
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    if-ne p1, v0, :cond_5

    return-object p0

    .line 682
    :cond_5
    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->withDelegate(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object p0

    return-object p0
.end method

.method public assignIndex(I)V
    .registers 2

    .line 702
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->assignIndex(I)V

    return-void
.end method

.method public deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 784
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeAndSet(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)V

    return-void
.end method

.method public deserializeSetAndReturn(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 791
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0, p1, p2, p3}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->deserializeSetAndReturn(Lcom/fasterxml/jackson/core/JsonParser;Lcom/fasterxml/jackson/databind/DeserializationContext;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public fixAccess(Lcom/fasterxml/jackson/databind/DeserializationConfig;)V
    .registers 2

    .line 707
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->fixAccess(Lcom/fasterxml/jackson/databind/DeserializationConfig;)V

    return-void
.end method

.method public getCreatorIndex()I
    .registers 1

    .line 747
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getCreatorIndex()I

    move-result p0

    return p0
.end method

.method protected getDeclaringClass()Ljava/lang/Class;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 717
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getDeclaringClass()Ljava/lang/Class;

    move-result-object p0

    return-object p0
.end method

.method public getInjectableValueId()Ljava/lang/Object;
    .registers 1

    .line 750
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getInjectableValueId()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public getManagedReferenceName()Ljava/lang/String;
    .registers 1

    .line 720
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getManagedReferenceName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public getMember()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;
    .registers 1

    .line 757
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getMember()Lcom/fasterxml/jackson/databind/introspect/AnnotatedMember;

    move-result-object p0

    return-object p0
.end method

.method public getObjectIdInfo()Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;
    .registers 1

    .line 723
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getObjectIdInfo()Lcom/fasterxml/jackson/databind/introspect/ObjectIdInfo;

    move-result-object p0

    return-object p0
.end method

.method public getValueDeserializer()Lcom/fasterxml/jackson/databind/JsonDeserializer;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 732
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getValueDeserializer()Lcom/fasterxml/jackson/databind/JsonDeserializer;

    move-result-object p0

    return-object p0
.end method

.method public getValueTypeDeserializer()Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;
    .registers 1

    .line 735
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->getValueTypeDeserializer()Lcom/fasterxml/jackson/databind/jsontype/TypeDeserializer;

    move-result-object p0

    return-object p0
.end method

.method public hasValueDeserializer()Z
    .registers 1

    .line 726
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->hasValueDeserializer()Z

    move-result p0

    return p0
.end method

.method public hasValueTypeDeserializer()Z
    .registers 1

    .line 729
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->hasValueTypeDeserializer()Z

    move-result p0

    return p0
.end method

.method public hasViews()Z
    .registers 1

    .line 741
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->hasViews()Z

    move-result p0

    return p0
.end method

.method public isInjectionOnly()Z
    .registers 1

    .line 753
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->isInjectionOnly()Z

    move-result p0

    return p0
.end method

.method public set(Ljava/lang/Object;Ljava/lang/Object;)V
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 796
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method

.method public setAndReturn(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 801
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0, p1, p2}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->setAndReturn(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public visibleInView(Ljava/lang/Class;)Z
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)Z"
        }
    .end annotation

    .line 738
    iget-object p0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->visibleInView(Ljava/lang/Class;)Z

    move-result p0

    return p0
.end method

.method protected abstract withDelegate(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
.end method

.method public withName(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .registers 3

    .line 692
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->withName(Lcom/fasterxml/jackson/databind/PropertyName;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->_with(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object p0

    return-object p0
.end method

.method public withNullProvider(Lcom/fasterxml/jackson/databind/deser/NullValueProvider;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .registers 3

    .line 697
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->withNullProvider(Lcom/fasterxml/jackson/databind/deser/NullValueProvider;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->_with(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object p0

    return-object p0
.end method

.method public withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/fasterxml/jackson/databind/JsonDeserializer<",
            "*>;)",
            "Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;"
        }
    .end annotation

    .line 687
    iget-object v0, p0, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->delegate:Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    invoke-virtual {v0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;->withValueDeserializer(Lcom/fasterxml/jackson/databind/JsonDeserializer;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty$Delegating;->_with(Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;)Lcom/fasterxml/jackson/databind/deser/SettableBeanProperty;

    move-result-object p0

    return-object p0
.end method
