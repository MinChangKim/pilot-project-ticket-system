package com.ticketsystem.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QTicketing is a Querydsl query type for Ticketing
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QTicketing extends EntityPathBase<Ticketing> {

    private static final long serialVersionUID = 2021556786L;

    public static final QTicketing ticketing = new QTicketing("ticketing");

    public final NumberPath<Integer> discountPrice = createNumber("discountPrice", Integer.class);

    public final NumberPath<Integer> discountRate = createNumber("discountRate", Integer.class);

    public final NumberPath<Integer> purchasePrice = createNumber("purchasePrice", Integer.class);

    public final StringPath showCd = createString("showCd");

    public final StringPath showDetCd = createString("showDetCd");

    public final StringPath ticketingCd = createString("ticketingCd");

    public final NumberPath<Integer> ticketingCnt = createNumber("ticketingCnt", Integer.class);

    public final DateTimePath<java.util.Date> ticketingDate = createDateTime("ticketingDate", java.util.Date.class);

    public final NumberPath<Long> ticketingSEq = createNumber("ticketingSEq", Long.class);

    public final StringPath userId = createString("userId");

    public QTicketing(String variable) {
        super(Ticketing.class, forVariable(variable));
    }

    public QTicketing(Path<? extends Ticketing> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTicketing(PathMetadata<?> metadata) {
        super(Ticketing.class, metadata);
    }

}

